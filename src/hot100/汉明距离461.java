package hot100;

/**
 * @author CWB
 * @date 2022/3/27
 * @apiNote
 */
public class 汉明距离461 {
    public int hammingDistance(int x, int y) {
        int num = x ^ y;
        int res = 0;
        while (num > 0) {
            num &= num - 1;
            res++;
        }
        return res;
    }

}
