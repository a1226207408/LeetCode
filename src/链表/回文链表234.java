package 链表;

import org.junit.jupiter.api.Test;

/**
 * 快慢指针寻找链表中点，反转中点后的部分，这样就可以从两端向中间进行比较
 * 时间复杂度O(n) 空间O(1)
 */
public class 回文链表234 {

    public boolean isPalindrome(ListNode head) {
        ListNode slow,fast;
        slow = fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //链表为奇数个
        if(fast != null){
            slow = slow.next;
        }

        ListNode left = head;
        ListNode right = reverse(slow);
        ListNode p = right;

        while(true){
            if(left.val != right.val){
                return false;
            }
            if (right.next == null){
                break;
            }
            left = left.next;
            right = right.next;
        }

        //将链表还原
        left.next = reverse(p);
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    @Test
    public void test(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
//        ListNode l5 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
//        l4.next = l5;
        System.out.println(isPalindrome(l1));
        System.out.println(l1);

    }
}
