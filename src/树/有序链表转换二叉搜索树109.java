package 树;


/**
 * @author CWB
 * @date 2022/4/14
 * @apiNote
 */
public class 有序链表转换二叉搜索树109 {
    ListNode cur;

    public TreeNode sortedListToBST(ListNode head) {
        int len = 0;
        cur = head;
        while (head != null) {
            len++;
            head = head.next;
        }
        return inorderBuild(0, len - 1);
    }

    TreeNode inorderBuild(int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode lt = inorderBuild(start, mid - 1);
        TreeNode root = new TreeNode(cur.val);
        cur = cur.next;
        TreeNode rt = inorderBuild(mid + 1, end);
        root.left = lt;
        root.right = rt;
        return root;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
