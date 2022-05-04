package 题库;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CWB
 * @date 2022/5/4
 * @apiNote
 */
public class LC3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int res = 0;
        for (int i = 0, j = 0; i < n; i++) {
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c) > 1) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}
