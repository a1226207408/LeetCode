package array;

public class 矩阵置零73 {
    public void setZeroes(int[][] matrix) {
        boolean flagRow = false;
        boolean flagCol = false;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0;i<col;i++){
            if (matrix[0][i] == 0) {
                flagRow = true;
                break;
            }
        }
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                flagCol = true;
                break;
            }
        }
        for(int i = 1;i<row;i++){
            for(int j = 1;j<col;j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1;i<row;i++){
            for(int j = 1;j<col;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(flagRow){
            for(int i = 0;i<col;i++){
                matrix[0][i] = 0;
            }
        }
        if(flagCol){
            for(int i = 0;i<row;i++){
                matrix[i][0] = 0;
            }
        }
    }
}
