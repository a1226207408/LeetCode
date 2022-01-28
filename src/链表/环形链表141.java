package 链表;

public class 环形链表141 {

    public static void main(String[] args) {
        ListNode l = new ListNode(3);
        ListNode cur = l;
        for (int i = 4; i < 10; i++) {
            ListNode temp = new ListNode(i);
            cur.next = temp;
            cur = temp;
        }
        cur.next = l;
        System.out.println(hasCycle(l));
    }
//    快慢指针
    public static boolean hasCycle(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
            if(fp == sp){
                return true;
            }
        }
        return false;
    }
}
