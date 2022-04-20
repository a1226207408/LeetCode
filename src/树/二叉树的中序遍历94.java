package 树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的中序遍历94 {

    List<Integer> res = new ArrayList<>();
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }
    void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }

    //迭代
    List<Integer> res1 = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    public List<Integer> inorderTraversal1(TreeNode root) {
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res1.add(root.val);
            root = root.right;
        }
        return res1;
    }
}
