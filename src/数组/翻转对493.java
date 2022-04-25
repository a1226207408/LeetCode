package 数组;

/**
 * @author CWB
 * @date 2022/4/2
 * @apiNote
 */
public class 翻转对493 {
    int[] tmp;
    public int reversePairs(int[] nums) {
        tmp = new int[nums.length];
        return mergeSort(nums, 0, nums.length - 1);
    }
    int mergeSort(int[] q, int l, int r){
        if(l >= r) return 0;
        int mid = l + r >> 1;

        int res = mergeSort(q, l, mid) + mergeSort(q, mid + 1, r);
        for(int i = l, j = mid + 1;i <= mid; i++){
            while(j <= r && (long) q[j] * 2 < q[i]) j++;
            res += j - (mid + 1);
        }
        int k = 0, i = l, j = mid + 1;
        while(i <= mid && j <= r){
            if(q[i] <= q[j]) tmp[k++] = q[i++];
            else tmp[k++] = q[j++];
        }
        while(i <= mid) tmp[k++] = q[i++];
        while(j <= r) tmp[k++] = q[j++];
        for(i = l, j = 0; i <= r; i++, j++) q[i] = tmp[j];
        return res;
    }
}
