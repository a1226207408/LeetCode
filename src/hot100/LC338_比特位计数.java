package hot100;

/**
 * @author CWB
 * @date 2022/3/26
 * @apiNote
 */
public class LC338_比特位计数 {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = n; i >= 0; i--) {
            int res = 0;
            int t = i;
            while (t != 0) {
                t -= lowbit(t);
                res++;
            }
            arr[i] = res;
        }
        return arr;
    }

    int lowbit(int n) {
        return n & -n;
    }
}
