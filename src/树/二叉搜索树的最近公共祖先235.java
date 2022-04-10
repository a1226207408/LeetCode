package 树;

public class 二叉搜索树的最近公共祖先235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int val1 = Math.min(p.val,q.val);
        int val2 = Math.max(p.val,q.val);
        return find(root,val1,val2);
    }
    TreeNode find(TreeNode root,int val1,int val2){
        if(root==null){
            return null;
        }
        if(root.val>val2){
            return find(root.left,val1,val2);
        }
        if(root.val<val1){
            return find(root.right,val1,val2);
        }
        return root;
    }
}
