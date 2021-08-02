package 链表;

public class 删除链表的倒数第N个结点19 {

//    思路：使用双指针，删除倒数第N个结点，则指针之间相差N个节点
//    要删除倒数第N个结点，则要找到倒数第N+1个结点
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode fast = head;
        ListNode slow = dummy;
        for(int i = 0; i < n;i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        ListNode listNode = removeNthFromEnd(l1, 1);
        System.out.println(listNode);
    }
}
