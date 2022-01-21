package 树;

public class 路径总和112 {
    public boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,0);
        return flag;
    }
    public void helper(TreeNode node,int targetSum,int sum){
        if(node == null) return;
        sum += node.val;
        if(sum == targetSum && node.left == null && node.right == null){
            flag = true;
            return;
        }
        helper(node.left,targetSum,sum);
        helper(node.right,targetSum,sum);
    }
}
