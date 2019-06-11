/**
 * NumberOfIslands
 */
public class NumberOfIslands {

    // https://leetcode.com/problems/number-of-islands/submissions/

    public int numIslands(char[][] grid){
        int land = 0;
        int rowLength = grid.length;
        if(rowLength == 0){ return 0;}
        int colLength = grid[0].length;
        char[][] g = grid;

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){
                if(grid[i][j] == '1'){
                    land++;
                    dfsMark(g, i, j);
                }
            }
        }

        return land;
    }

    private void dfsMark(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = 0;
        dfsMark(grid, i - 1, j);
        dfsMark(grid, i + 1, j);
        dfsMark(grid, i, j - 1);
        dfsMark(grid, i, j + 1);
    }
    
}