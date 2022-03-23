package array;

class MyHashMap706 {

    private Node[] arr;
    private int capacity = 769;
    static class Node{
        int key;
        int val;
        Node next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    public MyHashMap706() {
        arr = new Node[capacity];
    }

    public void put(int key, int value) {
        Node node = new Node(key,value);
        int index = hash(key);
        Node temp = arr[index];
        if(temp == null){
            arr[index] = node;
        }else{
            if(temp.key == key){
                temp.val = value;
                return;
            }
            while(temp.next != null){
                if(temp.next.key == key){
                    temp.next.val = value;
                    return;
                }
                temp = temp.next;
            }
            temp.next = node;
        }

    }

    public int get(int key) {
        int index = hash(key);
        Node node = arr[index];
        while(node != null){
            if(node.key == key){
                return node.val;
            }
            node = node.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node node = arr[index];
        if(node != null){
            if(node.key == key){
                arr[index] = node.next;
                return;
            }
            while(node.next != null){
                if(node.next.key == key){
                    node.next = node.next.next;
                    return;
                }
                node = node.next;
            }
        }

    }

    private int hash(int num){
        return num % capacity;
    }


}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
