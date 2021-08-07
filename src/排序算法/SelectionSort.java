package 排序算法;

import java.util.Random;

public class SelectionSort {

    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        Random r = new Random();
        int amount = 100000;
        int[] arr = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = r.nextInt(amount);
        }

        long start = System.currentTimeMillis();
        selectionSort.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
//        System.out.println(Arrays.toString(arr));
    }
}
