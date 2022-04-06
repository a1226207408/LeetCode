package 树;

/**
 * @author CWB
 * @date 2022/4/6
 * @apiNote
 */
public class 不同的二叉搜索树96 {
    int[][] memo;
    public int numTrees(int n) {
        memo = new int[n+1][n+1];
        return count(1,n);
    }
    int count(int lo,int hi){
        if(lo>hi){
            return 1;
        }
        //使用备忘录，防止重复计算
        if(memo[lo][hi]!=0){
            return memo[lo][hi];
        }
        //统计每个元素作为根节点时，可以构造的BST
        //i作为根节点
        int res = 0;
        for(int i=lo;i<=hi;i++){
            int left = count(lo,i-1);
            int right = count(i+1,hi);
            res+=left*right;
        }
        memo[lo][hi] = res;
        return res;
    }
}
