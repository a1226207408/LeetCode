package array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 合并两个有序数组88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p3 = m + n - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 < 0) {
                nums1[p3--] = nums2[p2--];
            } else if (p2 < 0) {
                nums1[p3--] = nums1[p1--];
            } else if (nums1[p1] >= nums2[p2]) {
                nums1[p3--] = nums1[p1--];
            } else {
                nums1[p3--] = nums2[p2--];
            }
        }
    }

    @Test
    public void test() {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        merge(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }
}
