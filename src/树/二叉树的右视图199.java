package 树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/21
 * @apiNote
 */
public class 二叉树的右视图199 {
    LinkedList<TreeNode> level = new LinkedList<>();
    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root != null) {
            level.add(root);
        }
        while (!level.isEmpty()) {
            int sz = level.size();
            for (int i = 0; i < sz; i++) {
                TreeNode node = level.pop();
                if (i == sz - 1) {
                    res.add(node.val);
                }
                if (node.left != null) {
                    level.add(node.left);
                }
                if (node.right != null) {
                    level.add(node.right);
                }
            }
        }
        return res;
    }
}
