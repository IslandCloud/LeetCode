import java.util.ArrayList;
import java.util.List;

public class UniqueMorseCodeWords {

    // https://leetcode.com/problems/unique-morse-code-words/description/

    private static String[] morse_table = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    private static String[] words = {"gin", "zen", "gig", "msg"};

    private int uniqueMorseRepresentations(String[] words){
        List<String> unique_transformations = new ArrayList<>();
        for(String word : words){
            int word_length = word.length();
            StringBuilder transform = new StringBuilder();
            for(int i = 0; i < word_length; i++){
                transform.append(morse_table[word.charAt(i) - 'a']);
            }
            String temp = transform.toString();
            if(!unique_transformations.contains(temp)){
                unique_transformations.add(temp);
            }
        }

        return unique_transformations.size();
    }

}
