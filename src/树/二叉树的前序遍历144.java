package 树;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的前序遍历144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(list, root);
        return list;
    }

    public void preorder(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preorder(list, node.left);
        preorder(list, node.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
