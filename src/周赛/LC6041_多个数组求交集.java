package 周赛;

import java.util.*;

/**
 * @author CWB
 * @date 2022/4/24
 * @apiNote
 */
public class LC6041_多个数组求交集 {

    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        for (int[] arr : nums) {
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == len) {
                res.add(entry.getKey());
            }
        }
        res.sort(Comparator.comparingInt(Integer::intValue));
        return res;
    }

}
