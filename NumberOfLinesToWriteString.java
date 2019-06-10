import java.util.Arrays;

public class NumberOfLinesToWriteString{

    // https://leetcode.com/problems/number-of-lines-to-write-string/description/

    private static int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
    private static String S = "bbbcccdddaaa";

    private int get_width_from_letter(char c){
        return (int)c - 'a';
    }

    private int[] numberOfLines(int[] widths, String S){
        int lines = 1, current_width = 0;
        int length = S.length();
        for(int i = 0; i < length; i++){
            char c = S.charAt(i);
            int letter_width = widths[get_width_from_letter(c)];
            current_width += letter_width;
            if(current_width > 100){
                lines++;
                current_width = letter_width;
            }
        }

        int[] res = new int[2];
        res[0] = lines;
        res[1] = current_width;
        return res;
    }

}
