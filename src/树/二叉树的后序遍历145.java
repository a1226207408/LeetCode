package 树;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的后序遍历145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        postorder(l,root);
        return l;
    }
    public void postorder(List<Integer> list,TreeNode node){
        if(node == null){
            return;
        }
        postorder(list,node.left);
        postorder(list,node.right);
        list.add(node.val);
    }
}
