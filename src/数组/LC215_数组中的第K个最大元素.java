package 数组;

import org.junit.jupiter.api.Test;

public class LC215_数组中的第K个最大元素 {

    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k + 1;
        return quickSort(nums,0,nums.length-1,k);
    }
    int quickSort(int[] q,int l,int r,int k){
        if(l >= r) return q[l];
        int x = q[l + r >> 1], i = l - 1, j = r + 1;
        while(i < j){
            do i++; while(q[i] < x);
            do j--; while(q[j] > x);
            if(i < j){
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }
        int sl = j - l + 1;
        if(k <= sl) return quickSort(q, l, j, k);
        return quickSort(q, j + 1, r, k - sl);
    }

    @Test
    void test() {
        int[] a = new int[]{7, 6, 5, 4, 3, 2, 1};
        System.out.println(findKthLargest(a, 2));
    }
}
