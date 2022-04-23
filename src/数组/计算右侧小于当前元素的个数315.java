package 数组;

import java.util.LinkedList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/2
 * @apiNote
 */
public class 计算右侧小于当前元素的个数315 {
    private class Pair{
        int val;
        int index;
        Pair(int val,int index){
            this.val=val;
            this.index=index;
        }
    }
    int[] count;
    Pair[] temp;
    public List<Integer> countSmaller(int[] nums) {
        int len=nums.length;
        temp = new Pair[len];
        count = new int[len];
        Pair[] arr = new Pair[len];
        for(int i=0;i<len;i++){
            arr[i] = new Pair(nums[i],i);
        }
        sort(arr,0,len-1);
        List<Integer> res = new LinkedList<>();
        for(int num:count){
            res.add(num);
        }
        return res;
    }
    void sort(Pair[] nums,int lo,int hi){
        if(lo==hi){
            return;
        }
        int mid=lo+(hi-lo)/2;
        sort(nums,lo,mid);
        sort(nums,mid+1,hi);
        merge(nums,lo,mid,hi);
    }
    void merge(Pair[] nums,int lo,int mid,int hi){
        for(int i=lo;i<=hi;i++){
            temp[i]=nums[i];
        }
        int i=lo;
        int j=mid+1;
        for(int p=lo;p<=hi;p++){
            if(i==mid+1){
                nums[p]=temp[j++];
            }else if(j==hi+1){
                nums[p]=temp[i++];
                count[nums[p].index]+=j-mid-1;
            }else if(temp[i].val>temp[j].val){
                nums[p]=temp[j++];
            }else{
                nums[p]=temp[i++];
                count[nums[p].index]+=j-mid-1;
            }
        }
    }
}
