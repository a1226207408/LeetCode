package 树;

/**
 * @author CWB
 * @date 2022/4/7
 * @apiNote
 */
public class 二叉搜索子树的最大键值和1373 {
    int max = 0;
    public int maxSumBST(TreeNode root) {
        traverse(root);
        return max;
    }
    //定义int[] 存储结果，int[0]:是否为BST，1是0否。int[1]:子树中的最小值.int[2]:子树中的最大值.int[3]:当前树所有节点和
    int[] traverse(TreeNode node){
        if(node==null){
            return new int[]{1,Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        }
        int[] leftRes = traverse(node.left);
        int[] rightRes = traverse(node.right);
        //后序遍历位置计算结果
        int[] res = new int[4];
        //判断是否为BST
        if(leftRes[0]==1 && rightRes[0]==1 &&
                leftRes[2] < node.val && rightRes[1]>node.val){
            //构造结果
            res[0] = 1;
            res[1] = Math.min(leftRes[1],node.val);
            res[2] = Math.max(rightRes[2],node.val);
            res[3] = leftRes[3]+rightRes[3]+node.val;
            max = Math.max(max,res[3]);
        }
        return res;
    }
}
