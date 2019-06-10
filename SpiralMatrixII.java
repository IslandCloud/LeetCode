import java.util.Arrays;

public class SpiralMatrixII{

    // https://leetcode.com/problems/spiral-matrix-ii/description/

    private int[][] generateMatrix(int n){
        int[][] result = new int[n][n];
        int row_start = 0, col_start = 0;
        int row_end = n - 1, col_end = n - 1;
        int current = 1;
        while(row_start <= row_end && col_start <= col_end){
            // RIGHT
            for(int j = col_start; j <= col_end; j++){
                result[row_start][j] = current;
                current++;
            }
            row_start++;

            // DOWN
            if(row_start <= row_end){
                for(int i = row_start; i <= row_end; i++){
                    result[i][col_end] = current;
                    current++;
                }
                col_end--;
            }

            // LEFT
            if(row_start <= row_end && col_start <= col_end){
                for(int j = col_end; j >= col_start; j--){
                    result[row_end][j] = current;
                    current++;
                }
                row_end--;
            }

            // UP
            if(row_start <= row_end && col_start <= col_end){
                for(int i = row_end; i >= row_start; i--){
                    result[i][col_start] = current;
                    current++;
                }
                col_start++;
            }
        }

        return result;
    }

}
