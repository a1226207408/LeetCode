package 树;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的中序遍历94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorder(l,root);
        return l;
    }

    public void inorder(List<Integer> list,TreeNode node){
        if(node == null){
            return;
        }
        inorder(list,node.left);
        list.add(node.val);
        inorder(list,node.right);
    }
}
