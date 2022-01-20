package 树;

public class 二叉树的最大深度104 {
    private int max = 0;

    public int maxDepth(TreeNode root) {
        helper(root, 1);
        return max;
    }

    public void helper(TreeNode node, int level) {
        if (node == null) return;
        max = Math.max(max, level);

        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }
}
