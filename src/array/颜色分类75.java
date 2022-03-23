package array;

public class 颜色分类75 {

    public void sortColors(int[] nums) {
        int p0 = 0,len = nums.length,p2 = len-1,i=0;
        while(i <= p2){
            if(nums[i] == 0){
                swap(nums,p0,i);
                p0++;
                i++;
            }else if(nums[i] == 1){
                i++;
            }else{
                swap(nums,p2,i);
                p2--;
            }
        }
    }

    private void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
