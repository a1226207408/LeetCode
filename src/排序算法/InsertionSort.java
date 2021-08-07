package 排序算法;

import java.util.Random;

public class InsertionSort {

    public void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > value){
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        Random r = new Random();
        int amount = 100000;
        int[] arr = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = r.nextInt(amount);
        }

        long start = System.currentTimeMillis();
        insertionSort.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
