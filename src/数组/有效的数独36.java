package 数组;

import org.junit.jupiter.api.Test;

public class 有效的数独36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][][] subboxes = new int[3][3][9];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                char c = board[i][j];
                if(c != '.'){
                    int index = c - '0' - 1;
                    rows[i][index]++;
                    columns[j][index]++;
                    subboxes[i/3][j/3][index]++;
                    if(rows[i][index] > 1 || columns[j][index]> 1 || subboxes[i/3][j/3][index] > 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    @Test
    public void test(){
        System.out.println(1/3);
    }
}
