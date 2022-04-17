package 树;

import java.util.LinkedList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/17
 * @apiNote
 */
public class 路径总和II113 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        traverse(root, targetSum);
        return res;
    }

    void traverse(TreeNode root, int sum) {
        if (root == null) return;
        path.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<Integer>(path));
        }
        traverse(root.left, sum);
        traverse(root.right, sum);
        path.removeLast();
    }
}
