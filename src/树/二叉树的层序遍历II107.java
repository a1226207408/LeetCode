package 树;

import java.util.LinkedList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/16
 * @apiNote
 */
public class 二叉树的层序遍历II107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        LinkedList<List<Integer>> res = new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        //自顶向下遍历
        while(!q.isEmpty()){
            int sz = q.size();
            List<Integer> list = new LinkedList<>();
            for(int i=0;i<sz;i++){
                TreeNode node = q.pop();
                list.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            res.addFirst(list);
        }
        return res;
    }
}
