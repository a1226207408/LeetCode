package 树;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/14
 * @apiNote
 */
public class 二叉树的锯齿形层序遍历103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> level = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if(root!=null){
            level.add(root);
        }
        boolean flag = true;
        while(!level.isEmpty()){
            int sz = level.size();
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0;i<sz;i++){
                TreeNode node = level.pop();
                if(flag){
                    list.addLast(node.val);
                }else{
                    list.addFirst(node.val);
                }
                if(node.left!=null){
                    level.add(node.left);
                }
                if(node.right!=null){
                    level.add(node.right);
                }
            }
            flag = !flag;
            res.add(list);
        }
        return res;
    }

    @Test
    void test(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> lists = zigzagLevelOrder(root);
        System.out.println(lists);

    }
}
