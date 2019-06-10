import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix{

    // https://leetcode.com/problems/spiral-matrix/description/

    private static int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

    private List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new LinkedList<>();
        if(matrix.length == 0){
            return list;
        }
        int row_start = 0, col_start = 0;
        int row_end = matrix.length - 1, col_end = matrix[0].length - 1;
        while(row_start <= row_end && col_start <= col_end){
            // Right
            for(int j = col_start; j <= col_end; j++){
                list.add(matrix[row_start][j]);
            }
            row_start++;

            // Down
            if(row_start <= row_end){
                for(int i = row_start; i <= row_end; i++){
                    list.add(matrix[i][col_end]);
                }
                col_end--;
            }

            // Left
            if(row_start <= row_end && col_start <= col_end){
                for(int j = col_end; j >= col_start; j--){
                    list.add(matrix[row_end][j]);
                }
                row_end--;
            }

            // Up
            if(row_start <= row_end && col_start <= col_end){
                for(int i = row_end; i >= row_start; i--){
                    list.add(matrix[i][col_start]);
                }
                col_start++;
            }
        }

        return list;
    }

}
