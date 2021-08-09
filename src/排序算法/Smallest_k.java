package 排序算法;
//寻找数组中第k小的值 解法：快速选择  时间复杂度：O(n)

public class Smallest_k {

    public int quickSort(int[] q,int l,int r,int k){
        if (l == r) return q[l];
        int x = q[l],i = l - 1,j = r + 1;
        while (i < j){
            do i++;while (q[i] < x);
            do j--;while (q[j] > x);
            if (i < j){
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        int sl = j - l + 1;
        if (k <= sl) return quickSort(q,l,j,k);
        return quickSort(q,j + 1,r,k - sl);
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,4,3,2,1};
        Smallest_k s = new Smallest_k();
        System.out.println(s.quickSort(a,0,a.length - 1,1));
    }
}
