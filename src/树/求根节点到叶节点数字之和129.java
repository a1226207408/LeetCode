package 树;

/**
 * @author CWB
 * @date 2022/4/17
 * @apiNote
 */
public class 求根节点到叶节点数字之和129 {
    int res;
    StringBuilder path = new StringBuilder();

    public int sumNumbers(TreeNode root) {
        traverse(root);
        return res;
    }

    void traverse(TreeNode root) {
        if (root == null) return;
        path.append(root.val);
        if (root.left == null && root.right == null) {
            res += Integer.parseInt(path.toString());
        }
        traverse(root.left);
        traverse(root.right);
        path.deleteCharAt(path.length() - 1);
    }
}
