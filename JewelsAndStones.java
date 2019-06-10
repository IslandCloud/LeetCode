import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones{

    // https://leetcode.com/problems/jewels-and-stones/description/

    private static String J = "aA", S = "aAAbbbb";

    private int numJuwelsInStones(String J, String S){
        Set<Character> jewels = new HashSet<>();
        int number = 0;
        for(char j : J.toCharArray()){
            jewels.add(j);
        }
        for(char s : S.toCharArray()){
            if(jewels.contains(s)){
                number++;
            }
        }

        return number;
    }

}
