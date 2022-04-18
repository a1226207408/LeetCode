package 链表;

/**
 * @author CWB
 * @date 2022/4/18
 * @apiNote
 */
public class 合并两个有序链表21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        p.next = list1 != null ? list1 : list2;
        return dummy.next;
    }
}
