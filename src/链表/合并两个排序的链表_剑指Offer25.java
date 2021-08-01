package 链表;

public class 合并两个排序的链表_剑指Offer25 {
//    建立一个头节点，将两个链表比较插入
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null && l2 != null){
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1:l2;
        return head.next;

    }
}
