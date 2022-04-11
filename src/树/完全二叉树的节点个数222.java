package 树;

/**
 * @author CWB
 * @date 2022/4/11
 * @apiNote
 */
public class 完全二叉树的节点个数222 {
    public int countNodes(TreeNode root) {
        TreeNode l = root;
        TreeNode r = root;
        int hl = 0;
        int hr = 0;
        while (l != null) {
            l = l.left;
            hl++;
        }
        while (r != null) {
            r = r.right;
            hr++;
        }
        if (hl == hr) {
            return (int) Math.pow(2, hl) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
