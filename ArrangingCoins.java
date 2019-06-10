public class ArrangingCoins{

    // https://leetcode.com/problems/arranging-coins/description/

    private int arrangeCoins(int n){
        int left = n, row = 1;
        while(left >= row){
            left -= row;
            row++;
        }

        return row - 1;
    }

}
