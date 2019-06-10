import java.util.Arrays;

public class SpiralMatrixIII{

    // https://leetcode.com/problems/spiral-matrix-iii/description/

    public int[][] spiralMatrixIII(int R, int C, int r0, int c0){
        int total = R * C;
        int[][] result = new int[total][2];
        int length = 1;
        int current = 0;
        int row = r0, col = c0;

        // First
        result[0] = new int[]{r0, c0};
        current++;

        while(current < total){
            // Right
            for(int i = 0; i < length; i++){
                col++;
                if(row < 0 || row >= R || col < 0 || col >= C){
                    continue;
                }else{
                    result[current] = new int[]{row, col};
                    current++;
                }
            }

            // Down
            for(int i = 0; i < length; i++){
                row++;
                if(row < 0 || row >= R || col < 0 || col >= C){
                    continue;
                }else{
                    result[current] = new int[]{row, col};
                    current++;
                }
            }
            length++;

            // Left
            for(int i = 0; i < length; i++){
                col--;
                if(row < 0 || row >= R || col < 0 || col >= C){
                    continue;
                }else{
                    result[current] = new int[]{row, col};
                    current++;
                }
            }

            // Up
            for(int i = 0; i < length; i++){
                row--;
                if(row < 0 || row >= R || col < 0 || col >= C){
                    continue;
                }else{
                    result[current] = new int[]{row, col};
                    current++;
                }
            }
            length++;
        }

        return result;
    }

}