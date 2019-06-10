import java.util.Arrays;

public class MaxIncreaseToKeepCitySkyline{

    // https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/

    public int maxIncreaseKeepingSkyline(int[][] grid){
        int sum = 0;
        int row = grid.length, col = grid[0].length;
        int[] top = new int[col]; // skyline from top or bottom
        int[] left = new int[row]; // skyline from left or right
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                left[i] = Math.max(left[i], grid[i][j]);
                top[j] = Math.max(top[j], grid[i][j]);
            }
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum += Math.min(left[i], top[j]) - grid[i][j];
            }
        }

        return sum;
    }

}