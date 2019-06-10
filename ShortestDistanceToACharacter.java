import java.util.Arrays;

public class ShortestDistanceToACharacter {

    // https://leetcode.com/problems/shortest-distance-to-a-character/description/

    private static String S = "loveleetcode";
    private static char C = 'e';

    private int[] shortestToChar(String S, char C){
        int length = S.length();
        int result[] = new int[length];
        int pos = length;

        // iteration forward
        for(int i = 0; i < length; i++){
            if(S.charAt(i) == C){
                pos = i;
            }
            result[i] = Math.abs(i - pos);
        }

        // iteration backward
        for(int i = length - 1; i >= 0; i--){
            if(S.charAt(i) == C){
                pos = i;
            }
            result[i] = Math.min(result[i], Math.abs(pos - i));
        }

        return result;
    }

}
