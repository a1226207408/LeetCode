package 排序算法;

import java.util.Random;

public class BubbleSort {

    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        Random r = new Random();
        int amount = 100000;
        int[] arr = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = r.nextInt(amount);
        }

        long start = System.currentTimeMillis();
        bubbleSort.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
