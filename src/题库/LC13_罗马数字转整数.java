package 题库;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CWB
 * @date 2022/5/7
 * @apiNote
 */
public class LC13_罗马数字转整数 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
        }

        return res;
    }
}
