package 树;

/**
 * @author CWB
 * @date 2022/4/4
 * @apiNote
 */
public class 把二叉搜索树转换为累加树538 {
    int sum;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        convertBST(root.right);
        sum+=root.val;
        root.val=sum;
        convertBST(root.left);
        return root;
    }
}
