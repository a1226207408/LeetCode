package 排序算法;

import java.util.Random;

public class QuickSort {
    //快速排序
    public int[] quickSort(int[] nums) {
        if (nums.length <= 1) return nums;
        //保证随机性
        shuffle(nums);
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    void sort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int p = partition(nums, lo, hi);
        sort(nums, lo, p - 1);
        sort(nums, p + 1, hi);
    }

    //分区，确保nums[lo..p)<=p,(p..hi}>p
    int partition(int[] nums, int lo, int hi) {
        int pivot = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            //如果lo就是最大值，i==hi防止数组越界
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

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        Random r = new Random();
        int amount = 10000000;
        int[] arr = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = r.nextInt(amount);
        }

        long start = System.currentTimeMillis();
        quickSort.quickSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
