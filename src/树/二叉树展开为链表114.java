package 树;

/**
 * @author CWB
 * @date 2022/3/29
 * @apiNote
 */
public class 二叉树展开为链表114 {
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        //递归到底部，自底向上操作
        flatten(root.left);
        flatten(root.right);

        //将左子树置空，右子树设为左子树
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;

        //将原先右子树加到现右子树后
        TreeNode p = root;
        while(p.right!=null){
            p = p.right;
        }
        p.right = right;
    }
}
