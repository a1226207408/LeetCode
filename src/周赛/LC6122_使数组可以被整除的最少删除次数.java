package 周赛;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LC6122_使数组可以被整除的最少删除次数 {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int i = 0;
        int num = nums[i];
        int res = 0;
        boolean found = false;
        while (i < nums.length) {
            int count = 1;
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }
            boolean flag = true;
            for (int t : numsDivide) {
                if (t % nums[i] != 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) res += count;
            else {
                found = true;
                break;
            }
            i++;
        }
        if (found) return res;
        else return -1;
    }

    @Test
    public void test() {
        int[] nums = {4,3,6};
        int[] d = {8,2,6,10};
        System.out.println(minOperations(nums, d));
    }
}
