package 排序算法;

import java.util.Random;

public class MergeSort {
    static int[] temp = new int[50000000];
    public void sort(int[] a,int l,int r){
        if (l >= r) return;
        int mid = l + r >> 1;
        sort(a,l,mid);
        sort(a,mid + 1,r);
        int k = 0;
        int i = l;
        int j = mid + 1;
        while (i <= mid && j <= r){
            if (a[i] <= a[j]) temp[k++] = a[i++];
            else temp[k++] = a[j++];
        }
        while (i <= mid){
            temp[k++] = a[i++];
        }
        while (j <= r){
            temp[k++] = a[j++];
        }
        for (i = l,j = 0; i <= r; i++,j++) a[i] = temp[j];
    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        Random r = new Random();
        int amount = 10000000;
        int[] arr = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = r.nextInt(amount);
        }

        long start = System.currentTimeMillis();
        sort.sort(arr,0,arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
