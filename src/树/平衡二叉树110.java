package 树;

/**
 * @author CWB
 * @date 2022/4/13
 * @apiNote
 */
public class 平衡二叉树110 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }
    int dfs(TreeNode root){
        if(root==null) return 0;
        int hl = dfs(root.left);
        int hr = dfs(root.right);
        if(Math.abs(hl-hr) > 1){
            flag = false;
        }
        return 1+Math.max(hl,hr);
    }
}
