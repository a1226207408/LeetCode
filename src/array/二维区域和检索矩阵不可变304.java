package array;

/**
 * @author CWB
 * @date 2022/4/22
 * @apiNote
 */
public class 二维区域和检索矩阵不可变304 {

}
class NumMatrix {
    int[][] preSum;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length+1,n=matrix[0].length+1;
        preSum = new int[m][n];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                preSum[i][j] = preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1] + matrix[i-1][j-1];
            }
        }
    }

    public int sumRegion(int x1, int y1, int x2, int y2) {
        x1++;y1++;x2++;y2++;
        return preSum[x2][y2] - preSum[x2][y1-1] - preSum[x1-1][y2] + preSum[x1-1][y1-1];
    }
}