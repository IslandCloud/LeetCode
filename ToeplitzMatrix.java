public class ToeplitzMatrix{

    // https://leetcode.com/problems/toeplitz-matrix/description/

    private static int[][]matrix = {{11,74,7,93},
                                    {40,11,74,7}};

    private boolean isToeplitzMatrix(int[][] matrix){
        int row = matrix.length, column = matrix[0].length;
        if(row == 1 || column == 1){
            return true;
        }

        for(int i = 0; i < row - 1; i++){
            int n = matrix[i][0];
            for(int t = 0; i + t < row && t < column; t++){
                if(matrix[i + t][t] != n){
                    return false;
                }
            }
        }

        for(int j = 1; j < column - 1; j++){
            int n = matrix[0][j];
            for(int t = 0; t < row && j + t < column; t++){
                if(matrix[t][j + t] != n){
                    return false;
                }
            }
        }

        return true;
    }

}
