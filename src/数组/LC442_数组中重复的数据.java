package 数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/5/8
 * @apiNote
 */
public class LC442_数组中重复的数据 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int n : nums) {
            int t = Math.abs(n);
            nums[t - 1] *= -1;
            if (nums[t - 1] > 0) {
                res.add(t);
            }
        }
        return res;
    }
}
