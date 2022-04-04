package 树;

/**
 * @author CWB
 * @date 2022/4/4
 * @apiNote
 */
public class 二叉搜索树中第K小的元素230 {
    int num;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return res;
    }
    void traverse(TreeNode node,int k){
        if(node==null){
            return;
        }
        traverse(node.left,k);
        num++;
        if(num==k){
            res = node.val;
        }
        traverse(node.right,k);
    }
}
