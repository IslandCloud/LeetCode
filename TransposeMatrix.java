import java.util.Arrays;

public class TransposeMatrix{

    // https://leetcode.com/problems/transpose-matrix/description/

    private static int[][] A = {{1,2,3}, {4,5,6}};
    private static int row = A.length;
    private static int column = A[0].length;

    private int[][] transpose(int[][] A){

        int[][] B = new int[column][row];
        for(int x = 0; x < column; x++){
            for(int y = 0; y < row; y++){
                B[x][y] = A[y][x];
            }
        }

        return B;
    }

    private void printArray(int[][] array){
        int length = array.length;
        for(int i = 0; i < length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
