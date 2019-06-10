import java.util.Arrays;
import java.util.Map;

public class FlippingAnImage{

    // https://leetcode.com/problems/flipping-an-image/description/

    private static int[][] A = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};

    private int[][] flipAndInvertImage(int[][] A) {
        int row = A.length, column = A[0].length;
        int[][] output = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                output[i][j] = A[i][column - j - 1] == 1 ? 0 : 1;
            }
        }

        return output;
    }

}
