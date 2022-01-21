package 树;

public class 翻转二叉树226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        invert(root);
        return root;
    }

    public void invert(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        if(node.left != null){
            invert(node.left);
        }
        if(node.right != null){
            invert(node.right);
        }
    }
}
