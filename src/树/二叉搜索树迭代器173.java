package 树;

import java.util.Stack;

/**
 * @author CWB
 * @date 2022/4/20
 * @apiNote
 */
public class 二叉搜索树迭代器173 {
    Stack<TreeNode> stack = new Stack<>();

    public 二叉搜索树迭代器173(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode root = stack.pop();
        int val = root.val;
        root = root.right;
        while (root != null) {
            stack.add(root);
            root = root.left;
        }
        return val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
