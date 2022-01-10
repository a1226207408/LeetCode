package 二分查找;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;

public class 搜索旋转排序数组33 {
    public int search(int[] nums, int target) {
        int low = 0, n = nums.length - 1, high = n;
        while (low <= high) {
            int mid = low + (high - low >> 1);
            if (nums[mid] == target) return mid;
            if (nums[0] <= nums[mid]) { //nums[0]-nums[mid]绝对有序
                if (nums[0] <= target && nums[mid] > target) high = mid - 1;
                else low = mid + 1;
            } else {//断点在nums[0]-nums[mid]之间
                if (nums[mid] < target && nums[n] >= target) low = mid + 1;
                else high = mid - 1;
            }

        }
        return -1;


    }

    public static void main(String[] args) {
        搜索旋转排序数组33 s = new 搜索旋转排序数组33();
        int[] n = new int[]{5, 1, 3};
        System.out.println(s.search(n, 5));
//        String s1 = "programming";
//        String s2 = new String("programming");
//        String s3 = "program" + "ming";
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.intern() == s2.intern());
        int hash = Objects.hash(Arrays.hashCode(new int[]{1, 2, 3}));
        int hash1 = Objects.hash(Arrays.hashCode(new int[]{1, 2, 3}));
        System.out.println(hash);
        System.out.println(hash1);

    }
}
