package 数组;

/**
 * @author CWB
 * @date 2022/4/28
 * @apiNote
 */
public class LC905_按奇偶排序数组 {
    public int[] sortArrayByParity(int[] nums) {
        int l = -1, r = nums.length;
        while(l < r){
            do l++; while(l < r && nums[l] % 2 == 0);
            do r--; while(l < r && nums[r] %2 != 0);
            if(l < r){
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
            }
        }
        return nums;
    }
}
