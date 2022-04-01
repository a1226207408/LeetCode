package 树;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author CWB
 * @date 2022/4/1
 * @apiNote
 */
public class 找重复的子树652 {
    Map<String, Integer> subTrees = new HashMap<>();
    List<TreeNode> res = new LinkedList<>();
    final String NULL = "#";
    final String SPLIT = ",";

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }

    private String traverse(TreeNode node) {
        if (node == null) {
            return NULL + SPLIT;
        }
        String leftTree = traverse(node.left);
        String rightTree = traverse(node.right);
        String tree = node.val + SPLIT + leftTree + SPLIT + rightTree;
        Integer count = subTrees.getOrDefault(tree, 0);
        if (count == 1) {
            res.add(node);
        }
        subTrees.put(tree, count + 1);
        return tree;
    }
}
