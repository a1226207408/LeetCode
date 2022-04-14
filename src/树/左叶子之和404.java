package 树;

/**
 * @author CWB
 * @date 2022/4/14
 * @apiNote
 */
public class 左叶子之和404 {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return sum;
    }
    void dfs(TreeNode root){
        if(root==null) return;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            sum+=root.left.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
