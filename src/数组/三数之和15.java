package 数组;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和15 {
    public List<List<Integer>> threeSum1(int[] nums) {
        if (nums == null) {
            return null;
        }
        int len = nums.length;
        if (len < 3) {
            return null;
        }

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0) {
                return list;
            }
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[L], nums[R]);
                    list.add(temp);
                    while (L < R && nums[L] == nums[L + 1]) L++;
                    while (L < R && nums[R] == nums[R - 1]) R--;
                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                } else {
                    R--;
                }
            }

        }
        return list;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                return result;
            }
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum > 0){
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    right--;
                }else{
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    left++;
                }
            }
        }
        return result;
    }

    @Test
    public void test() {
        int[] arr = {-4, -1, -1, 0, 1, 2};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists);
    }
}
