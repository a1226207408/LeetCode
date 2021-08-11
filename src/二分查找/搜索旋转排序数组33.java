package 二分查找;

public class 搜索旋转排序数组33 {
    public int search(int[] nums, int target) {
        int low = 0,n = nums.length - 1,high = n;
        while (low <= high){
            int mid = low + (high - low >> 1);
            if (nums[mid] == target) return mid;
            if (nums[0] <= nums[mid]){ //nums[0]-nums[mid]绝对有序
                if (nums[0] <= target && nums[mid] > target) high = mid - 1;
                else low = mid + 1;
            }else {//断点在nums[0]-nums[mid]之间
                if (nums[mid] < target && nums[n] >= target) low = mid + 1;
                else high = mid - 1;
            }

        }
        return -1;




    }

    public static void main(String[] args) {
        搜索旋转排序数组33 s = new 搜索旋转排序数组33();
        int[] n = new int[]{5,1,3};
        System.out.println(s.search(n,5));
    }
}
