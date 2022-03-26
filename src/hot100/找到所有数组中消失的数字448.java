package hot100;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/3/26
 * @apiNote
 */
public class 找到所有数组中消失的数字448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int len = nums.length;
        for (int num : nums) {
            int x = (num - 1) % len;
            nums[x] += len;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] <= len) {
                result.add(i + 1);
            }
        }
        return result;
    }
    @Test
    public void test(){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
