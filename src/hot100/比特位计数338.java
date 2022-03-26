package hot100;

/**
 * @author CWB
 * @date 2022/3/26
 * @apiNote
 */
public class 比特位计数338 {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0;i<=n;i++){
            int c = 0;
            for(int j=i;j>0;c++){
                j &= j-1;
            }
            result[i] = c;
        }
        return result;
    }
}
