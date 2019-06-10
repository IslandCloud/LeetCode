import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KeyboardRow {

    // https://leetcode.com/problems/keyboard-row/description/

    private static String[] input = {"Hello", "Alaska", "Dad", "Peace"};

    private String[] findWords(String[] words){
        List<String> output = new LinkedList<>();
        for(String word : words){
            if(word.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")){
                output.add(word);
            }
        }

        return output.toArray(new String[output.size()]);
    }

}
