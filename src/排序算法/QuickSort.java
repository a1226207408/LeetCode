package 排序算法;

import java.util.Random;

public class QuickSort {

    public void quickSort(int[] q,int l,int r){
        if (l >= r) return;
        int x = q[l + r >> 1],i = l - 1,j = r + 1;
        while (i < j){
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quickSort(q,l,j);
        quickSort(q,j + 1,r);
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
        quickSort.quickSort(arr,0,arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
