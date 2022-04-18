package 链表;

public class 删除链表的倒数第N个结点19 {

    //    思路：使用双指针，删除倒数第N个结点，则指针之间相差N个节点
    //    要删除倒数第N个结点，则要找到倒数第N+1个结点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = findFromEnd(dummy, n + 1);
        pre.next = pre.next.next;
        return dummy.next;
    }

    ListNode findFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
    //public static ListNode removeNthFromEnd(ListNode head, int n) {
    //    ListNode dummy = new ListNode(0,head);
    //    ListNode fast = head;
    //    ListNode slow = dummy;
    //    for(int i = 0; i < n;i++){
    //        fast = fast.next;
    //    }
    //    while(fast != null){
    //        fast = fast.next;
    //        slow = slow.next;
    //    }
    //    slow.next = slow.next.next;
    //    return dummy.next;
    //}

}
