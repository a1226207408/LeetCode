package 树;

/**
 * @author CWB
 * @date 2022/4/12
 * @apiNote
 */
public class 恢复二叉搜索树99 {
    TreeNode pre = null;
    TreeNode first = null;
    TreeNode last = null;

    public void recoverTree(TreeNode root) {
        dfs(root);
        int temp = first.val;
        first.val = last.val;
        last.val = temp;

    }

    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (pre != null && pre.val > root.val) {
            last = root;
            if (first == null) first = pre;
        }
        pre = root;
        dfs(root.right);
    }
}
