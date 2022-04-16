package 树;

import java.util.LinkedList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/16
 * @apiNote
 */
public class 二叉树的所有路径257 {
    List<String> res = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        preOrder(root,"");
        return res;
    }
    void preOrder(TreeNode root,String s){
        if(root==null) return;
        StringBuilder sb = new StringBuilder(s);
        sb.append(root.val);
        if(root.left==null&&root.right==null){
            res.add(sb.toString());
        }else{
            sb.append("->");
            preOrder(root.left,sb.toString());
            preOrder(root.right,sb.toString());
        }

    }
}
