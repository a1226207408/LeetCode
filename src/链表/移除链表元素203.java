package 链表;

public class 移除链表元素203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return dummyHead.next;
    }

}
