package 链表;

public class 反转链表206 {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode cur = l;
        for (int i = 2; i < 6; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        ListNode res = reverseList(l);
        System.out.println(res);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
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
