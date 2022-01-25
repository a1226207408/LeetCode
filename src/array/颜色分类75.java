package array;

public class 颜色分类75 {

    public void sortColors(int[] nums) {
        int p0 = 0, p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(nums, i, p1);
                p1++;
            } else if (nums[i] == 0) {
                if (p0 == p1) {
                    swap(nums, i, p0);
                    p0++;
                    p1++;
                } else {
                    swap(nums, i, p0);
                    swap(nums, i, p1);
                    p1++;
                    p0++;
                }
            }
        }
    }

    private void swap(int q[], int index1, int index2) {
        int temp = q[index1];
        q[index1] = q[index2];
        q[index2] = temp;
    }
}
