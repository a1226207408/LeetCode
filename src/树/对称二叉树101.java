package 树;

public class 对称二叉树101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode lt, TreeNode rt) {
        if (lt == null && rt == null) return true;
        if (lt == null || rt == null) return false;
        return lt.val == rt.val && helper(lt.left, rt.right) && helper(lt.right, rt.left);
    }
}
