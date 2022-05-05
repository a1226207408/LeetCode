package 题库;

/**
 * @author CWB
 * @date 2022/5/5
 * @apiNote
 */
public class LC713_乘积小于K的子数组 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int p = 1;
        for (int i = 0, j = 0; i < nums.length; i++) {
            p *= nums[i];
            while(j <= i && p >= k) p /= nums[j++];
            res += i - j + 1;
        }
        return res;
    }
}
