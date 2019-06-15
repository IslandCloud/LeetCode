/**
 * LengthofLastWord
 */
public class LengthofLastWord {

    // https://leetcode.com/problems/length-of-last-word/

    public int lengthOfLastWord(String s) { // "b   a    "
        int len = s.length();
        int word_length = 0;
        boolean start_count = false;
        for(int i = len - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                start_count = true;
                word_length++;
                continue;
            }
            if(start_count){
                break;
            }
        }

        return word_length;
    }
}