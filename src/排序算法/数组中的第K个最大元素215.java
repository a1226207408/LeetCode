package 排序算法;

public class 数组中的第K个最大元素215 {

    public int quickSort(int[] q,int l,int r,int k){
        if (l == r) return q[l];
        int x = q[l + r >> 1],i = l - 1,j = r + 1;
        while (i < j){
            do i++;while (q[i] < x);
            do j--;while (q[j] > x);
            if (i < j){
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        int sr = r - j;
        if (k > sr) return quickSort(q,l,j,k - sr);
        return quickSort(q,j + 1,r,k);
    }

    public static void main(String[] args) {
        int[] a = new int[]{7,6,5,4,3,2,1};
        数组中的第K个最大元素215 s = new 数组中的第K个最大元素215();
        System.out.println(s.quickSort(a,0,a.length - 1,2));
    }
}
