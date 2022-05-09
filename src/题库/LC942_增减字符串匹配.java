package 题库;

/**
 * @author CWB
 * @date 2022/5/9
 * @apiNote
 */
public class LC942_增减字符串匹配 {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int min = 0, max = n;
        int i = 0;
        int[] res = new int[n + 1];
        while (min != max) {
            if (s.charAt(i) == 'I') res[i++] = min++;
            else res[i++] = max--;
        }
        res[i] = min;
        return res;
    }
}
