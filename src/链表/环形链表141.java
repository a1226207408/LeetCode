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
        if(head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != slow){
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
