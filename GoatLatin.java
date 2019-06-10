import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoatLatin{

    // https://leetcode.com/problems/goat-latin/description/

    private static String input = "I speak Goat Latin";

    private String toGoatLatin(String S){
        Set<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder output = new StringBuilder();
        String[] split = S.split(" ");
        int length = split.length;

        for(int i = 0; i < length; i++){
            char first = split[i].charAt(0);
            if(vowel.contains(first)){
                output.append(split[i]);
            }else{
                output.append(split[i].substring(1)).append(first);
            }
            output.append("ma");

            for(int j = 0; j <= i; j++){
                output.append("a");
            }
            output.append(" ");
        }

        return output.substring(0, output.length() - 1);
    }

}
