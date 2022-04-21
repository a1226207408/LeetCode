package 链表;

import org.junit.jupiter.api.Test;

/**
 * @author CWB
 * @date 2022/2/3
 * @apiNote
 */
public class K个一组翻转链表25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        for (ListNode p = dummy; ; ) {
            ListNode q = p;
            for (int i = 0; i < k && q != null; i++) q = q.next;
            if (q == null) break;
            ListNode pre = p.next;
            ListNode cur = pre.next;
            for (int i = 0; i < k - 1; i++) {
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            ListNode temp = p.next;
            temp.next = cur;
            p.next = pre;
            p = temp;
        }
        return dummy.next;
    }
}
