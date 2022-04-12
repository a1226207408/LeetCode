package 树;

/**
 * @author CWB
 * @date 2022/4/12
 * @apiNote
 */
public class 二叉树的最小深度111 {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        dfs(root,0);
        return min;
    }
    void dfs(TreeNode root,int level){
        if(root==null){
            return;
        }
        level++;
        if(root.left==null&&root.right==null){
            min = Math.min(min,level);
        }else{
            dfs(root.left,level);
            dfs(root.right,level);
        }

    }
}
