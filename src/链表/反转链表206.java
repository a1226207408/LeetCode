package 链表;

import org.junit.jupiter.api.Test;

public class 反转链表206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode recursion(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode last = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    @Test
    public void test(){
        ListNode l = new ListNode(1);
        ListNode cur = l;
        for (int i = 2; i < 6; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
//        ListNode res = reverseList(l);
        ListNode res = recursion(l);
        System.out.println(res);
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
                 ListNode cur = this;
                 while(cur != null){
                        s.append(cur.val).append("->");
                        cur = cur.next;
                    }
                 s.append("NULL");
                 return s.toString();
    }

}
