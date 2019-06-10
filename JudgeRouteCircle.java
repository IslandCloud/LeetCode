public class JudgeRouteCircle{

    // https://leetcode.com/problems/judge-route-circle/description/

    private static String moves = "LLUD";

    private boolean judgeCircle(String moves){
        int direction[] = {0, 0}; // Horizontal & vertical
        int length = moves.length();
        for(int i = 0; i < length; i++){
            switch(moves.charAt(i)){
                case 'R':
                    direction[0]++;
                    break;
                case 'L':
                    direction[0]--;
                    break;
                case 'U':
                    direction[1]++;
                    break;
                case 'D':
                    direction[1]--;
                    break;
            }
        }

        return direction[0] == 0 && direction[1] == 0;
    }

}
