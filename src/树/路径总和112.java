package 树;

public class 路径总和112 {
    boolean flag = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        find(root, targetSum);
        return flag;
    }

    void find(TreeNode root, int sum) {
        if (root == null) return;
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            flag = true;
            return;
        }
        find(root.left, sum);
        find(root.right, sum);
    }
}
