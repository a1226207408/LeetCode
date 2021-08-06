package 队列;

/**
 * 数组实现循环队列
 */
public class CircularQueue {

    private String[] arr;
    private int n;
    private int head;
    private int tail;
    public CircularQueue(int length){
        arr = new String[length];
        n = length;
    }
    //入队列 队列满条件：(tail + 1) % n == head
    public boolean enQueue(String x){
        if ((tail + 1) % n == head){
            return false;
        }
        arr[tail] = x;
        tail = (tail + 1) % n;
        return true;
    }

    //出队列 队列为空条件：head == tail
    public String deQueue(){
        if (head == tail){
            return null;
        }
        return arr[head++];
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        System.out.println(queue.enQueue("1"));
        System.out.println(queue.enQueue("2"));
        System.out.println(queue.enQueue("3"));
        System.out.println(queue.enQueue("4"));
        System.out.println(queue.deQueue());
        System.out.println(queue.enQueue("5"));
        System.out.println(queue.deQueue());
    }
}
