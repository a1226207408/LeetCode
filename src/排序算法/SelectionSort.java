package 排序算法;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * 选择排序
 * 思想：每次找出数组中最小的元素，将其放到数组的有序部分的末尾；
 */
public class SelectionSort {

    public int[] sort(int[] nums){
        int minIndex;
        for(int i=0;i<nums.length;i++){
            minIndex=i;
            for(int j=i+1;j< nums.length;j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            swap(nums,i,minIndex);
        }
        return nums;
    }
    void swap(int[] nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }

    public boolean isSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] < nums[i]) return false;
        }
        return true;
    }
    @Test
    void test(){
        int N = 100000;
        int[] nums = new int[N];
        Random random = new Random();
        for(int i=0;i<N;i++){
            nums[i] = random.nextInt(N);
        }
        Assertions.assertFalse(isSorted(nums));
        sort(nums);
        Assertions.assertTrue(isSorted(nums));
    }
}
