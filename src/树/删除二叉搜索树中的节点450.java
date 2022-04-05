package 树;

/**
 * @author CWB
 * @date 2022/4/5
 * @apiNote
 */
public class 删除二叉搜索树中的节点450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            //不存在任何子树的和只存在一个子树可以用下面两个if判断
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            //左右子树都在,获取右子树中最小值，与删除元素替换
            TreeNode minNode = getMin(root.right);
            root.right = deleteNode(root.right, minNode.val);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;
            return root;
        } else if (root.val > key) {
            //递归寻找左子树
            root.left = deleteNode(root.left, key);
        } else {
            //递归找右子树
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    TreeNode getMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }
}
