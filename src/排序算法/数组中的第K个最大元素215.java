package 排序算法;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class 数组中的第K个最大元素215 {

    //快速选择
    public int findKthLargest(int[] nums, int k) {
        if (nums.length > 1) {
            shuffle(nums);
        }
        int lo = 0, hi = nums.length - 1;
        k = nums.length - k;
        while (lo <= hi) {
            int p = partition(nums, lo, hi);
            if (k > p) {
                lo = p + 1;
            } else if (k < p) {
                hi = p - 1;
            } else {
                return nums[p];
            }
        }
        return -1;
    }

    int partition(int[] nums, int lo, int hi) {
        if (lo == hi) {
            return lo;
        }
        int pivot = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (pivot > nums[++i]) if (i == hi) break;
            while (pivot < nums[--j]) if (j == lo) break;
            if (i >= j) break;
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;
    }

    void shuffle(int[] nums) {
        Random random = new Random();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int r = random.nextInt(len - 1);
            swap(nums, i, r);
        }
    }

    void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    @Test
    void test() {
        int[] a = new int[]{7, 6, 5, 4, 3, 2, 1};
        System.out.println(findKthLargest(a, 2));
    }
}
