package 树;

import java.util.LinkedList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/6
 * @apiNote
 */
public class 不同的二叉搜索树II95 {
    public List<TreeNode> generateTrees(int n) {
        return generate(1,n);
    }
    List<TreeNode> generate(int lo,int hi){
        List<TreeNode> res = new LinkedList<>();
        if(lo>hi){
            res.add(null);
            return res;
        }
        for(int i=lo;i<=hi;i++){
            //获取当前节点的所有左右子树集合
            List<TreeNode> lefts = generate(lo,i-1);
            List<TreeNode> rights = generate(i+1,hi);

            //枚举当前节点的所有左右子树组合
            for(TreeNode left:lefts){
                for(TreeNode right:rights){
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    res.add(node);
                }
            }

        }
        return res;
    }
}
