package 链表;

public class 反转链表II92 {
    private ListNode successor;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == 1){
            return reverseN(head,right);
        }
        head.next = reverseBetween(head.next,left - 1,right - 1);
        return head;
    }
    public ListNode reverseN(ListNode head,int n){
        if(n == 1){
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next,n-1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
