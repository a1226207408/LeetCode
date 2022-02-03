package 链表;

/**
 * @author CWB
 * @date 2022/2/3
 * @apiNote
 */
public class K个一组翻转链表25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        //判断剩余元素是否大于等于k
        ListNode a,b;
        a = b = head;
        for(int i = 0;i<k;i++){
            if(b == null){
                return a;
            }
            b = b.next;
        }

        ListNode newHead = reverse(a,b);
        a.next = reverseKGroup(b,k);
        return newHead;
    }
    public ListNode reverse(ListNode a,ListNode b){
        ListNode pre,cur,next;
        pre = null;
        cur = next = a;
        while(cur != b){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
