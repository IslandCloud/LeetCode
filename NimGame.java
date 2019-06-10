public class NimGame{

    // https://leetcode.com/problems/nim-game/description/

//    A: first player    B: second player    x: stones
//
//    1: A can take 1, 2, 3 stones.
//            (x-1), (x-2), (x-3)
//    2: B have 3 cases to deal with, and have 9 cases for next round.
//            (x-1) : (x-2), (x-3), (x-4)
//            (x-2) : (x-3), (x-4), (x-5)
//            (x-3) : (x-4), (x-5), (x-6)
//    3: if A can guarantee to win, he can force B to into one of these three states.
//            ((x-2)&&(x-3)&&(x-4)) || ((x-3)&&(x-4)&&(x-5)) || ((x-4)&&(x-5)&&(x-6))
//
//    if (x-4) is false, then the whole statement is false.

    private boolean canWinNim(int n){
        return n % 4 != 0;
    }

}
