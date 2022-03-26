package hot100;

/**
 * @author CWB
 * @date 2022/3/26
 * @apiNote
 */
public class 移动零283 {
    public void moveZeroes(int[] nums) {
        int p0,p1;
        p0 = p1 = 0;
        while(p1 < nums.length){
            if(nums[p1] != 0){
                swap(nums,p0,p1);
                p0++;
                p1++;
            }else{
                p1++;
            }
        }
    }
    private void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
