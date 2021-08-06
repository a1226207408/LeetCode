package 队列;

public class 设计循环队列622 {
    private int[] arr;
    private int n; //队列容量
    private int head;
    private int tail;
    private int size; //队列元素个数
    public 设计循环队列622(int k) {
        arr = new int[k];
        n = k;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        arr[tail] = value;
        tail = (tail + 1) % n;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        head = (head + 1) % n;
        size--;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1:arr[head];
    }

    public int Rear() {

        return isEmpty() ? -1:arr[(tail + n - 1) % n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }

    public static void main(String[] args) {
        设计循环队列622 q = new 设计循环队列622(3);
        System.out.println(q.enQueue(1));
        System.out.println(q.enQueue(2));
        System.out.println(q.enQueue(3));
        System.out.println(q.enQueue(4));
        System.out.println(q.Rear());
        System.out.println(q.isFull());
        System.out.println(q.deQueue());
        System.out.println(q.enQueue(4));
        System.out.println(q.Rear());
    }
}
