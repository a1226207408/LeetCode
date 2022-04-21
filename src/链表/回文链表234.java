package 链表;

/**
 * 快慢指针寻找链表中点，反转中点后的部分，这样就可以从两端向中间进行比较
 * 时间复杂度O(n) 空间O(1)
 */
public class 回文链表234 {

    public boolean isPalindrome(ListNode head) {
        //快慢指针找中点
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) slow = slow.next;
        ListNode left = head;
        //翻转链表后半部分
        ListNode right = reverse(slow);
        ListNode tail = right;
        boolean flag = true;
        while (right != null) {
            if (left.val != right.val) {
                flag = false;
                break;
            }
            left = left.next;
            right = right.next;
        }
        //将链表还原
        reverse(tail);
        return flag;
    }

    ListNode reverse(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
