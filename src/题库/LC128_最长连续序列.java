package 题库;

import java.util.HashSet;
import java.util.Set;

/**
 * @author CWB
 * @date 2022/5/4
 * @apiNote
 */
public class LC128_最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int res = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int cur = n;
                int count = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
