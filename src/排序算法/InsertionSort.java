package 排序算法;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * 插入排序
 * 思想：在数组的中维护一个有序区间，每次将元素插入到有序区间的合适位置上，每次插入会涉及到插入位置后有序元素的移动
 */
public class InsertionSort {

    public void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0 && nums[j] < nums[j - 1]; j--) {
                swap(nums, j, j - 1);
            }
        }
    }

    void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) return false;
        }
        return true;
    }

    @Test
    void test() {
        int N = 100000;
        int[] nums = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            nums[i] = random.nextInt(N);
        }
        Assertions.assertFalse(isSorted(nums));
        sort(nums);
        Assertions.assertTrue(isSorted(nums));
    }
}
