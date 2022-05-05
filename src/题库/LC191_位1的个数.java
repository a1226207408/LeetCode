package 题库;

/**
 * @author CWB
 * @date 2022/5/5
 * @apiNote
 */
public class LC191_位1的个数 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n -= lowbit(n);
            res++;
        }
        return res;
    }

    int lowbit(int n) {
        return n & -n;
    }
}
