package 树;

/**
 * @author CWB
 * @date 2022/4/4
 * @apiNote
 */
public class 从二叉搜索树到更大和树1038 {
    int sum;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null){
            return null;
        }
        bstToGst(root.right);
        sum+=root.val;
        root.val=sum;
        bstToGst(root.left);
        return root;
    }
}
