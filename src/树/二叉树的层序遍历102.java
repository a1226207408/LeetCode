package 树;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的层序遍历102 {
    private List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return list;
        }
        helper(root, 0);
        return list;
    }

    public void helper(TreeNode node, int level) {
        if (list.size() == level) {
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(node.val);

        if (node.left != null)
            helper(node.left, level + 1);
        if (node.right != null)
            helper(node.right, level + 1);
    }
}
