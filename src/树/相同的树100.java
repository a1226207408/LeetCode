package 树;

/**
 * @author CWB
 * @date 2022/4/12
 * @apiNote
 */
public class 相同的树100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        boolean l = dfs(p.left, q.left);
        boolean r = dfs(p.right, q.right);
        return p.val == q.val && l && r;
    }
}
