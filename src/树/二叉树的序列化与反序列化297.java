package 树;

import java.util.LinkedList;

/**
 * @author CWB
 * @date 2022/3/31
 * @apiNote
 */
public class 二叉树的序列化与反序列化297 {
    private StringBuilder sb = new StringBuilder();
    private final String SPLIT = ",";
    private final String NULL = "#";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        traverse(root);
        return sb.toString();
    }

    //前序遍历
    private void traverse(TreeNode node) {
        if (node == null) {
            sb.append(NULL).append(SPLIT);
            return;
        }
        sb.append(node.val).append(SPLIT);
        traverse(node.left);
        traverse(node.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> valList = new LinkedList<>();
        String[] vals = data.split(",");
        for (String val : vals) {
            valList.add(val);
        }
        return deserialize(valList);
    }

    private TreeNode deserialize(LinkedList<String> valList) {
        if (valList.isEmpty()) {
            return null;
        }
        String val = valList.removeFirst();
        if (val.equals("#")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserialize(valList);
        node.right = deserialize(valList);
        return node;
    }
}
