package 数组;

/**
 * @author CWB
 * @date 2022/4/2
 * @apiNote
 */
public class 翻转对493 {
    int[] temp;
    int count;
    public int reversePairs(int[] nums) {
        int len=nums.length;
        temp = new int[len];
        sort(nums,0,len-1);
        return count;
    }
    void sort(int[] nums,int lo,int hi){
        if(lo==hi){
            return;
        }
        int mid=lo+(hi-lo)/2;
        sort(nums,lo,mid);
        sort(nums,mid+1,hi);
        merge(nums,lo,mid,hi);
    }
    void merge(int[] nums,int lo,int mid,int hi){
        for(int i=lo;i<=hi;i++){
            temp[i]=nums[i];
        }
        int end=mid+1;
        for(int i=lo;i<=mid;i++){
            while(end<=hi && (long)nums[i] > (long)nums[end]*2){
                end++;
            }
            count += end - mid -1;
        }
        int i=lo;
        int j=mid+1;
        for(int p=lo;p<=hi;p++){
            if(i==mid+1){
                nums[p]=temp[j++];
            }else if(j==hi+1){
                nums[p]=temp[i++];
            }else if(temp[i] >temp[j]){
                nums[p]=temp[j++];
            }else{
                nums[p]=temp[i++];
            }
        }
    }
}
