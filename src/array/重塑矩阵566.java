package array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 重塑矩阵566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int count = 0;
        for (int[] ints : mat) {
            count += ints.length;
        }
        if(r*c != count){
            return mat;
        }
        int[] arr = new int[count];
        count = 0;
        for (int[] ints : mat) {
            for (int anInt : ints) {
                arr[count++] = anInt;
            }
        }
        count = 0;
        int[][] res = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                res[i][j] = arr[count++];
            }
        }
        return res;
    }

    @Test
    public void test(){
        int[][] arr = {{1,2},{3,4}};
        int[][] ints = matrixReshape(arr, 4, 1);
        for (int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }
    }
}
