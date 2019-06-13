/**
 * ReverseVowelsOfAString
 */
public class ReverseVowelsOfAString {

    // https://leetcode.com/problems/reverse-vowels-of-a-string/

    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] ss = s.toCharArray();
        int len = s.length();
        int i = 0, j = len - 1;
        while(i < j){
            while(i < j && vowels.indexOf(ss[i]) == -1){
                i++;
            }

            while(i < j && vowels.indexOf(ss[j]) == -1){
                j--;
            }

            char t = ss[i];
            ss[i] = ss[j];
            ss[j] = t;
            i++;
            j--;
        }

        return new String(ss);
    }
}