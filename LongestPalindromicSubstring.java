public class LongestPalindromicSubstring{

    private static String s = "cbbd";

    private String extend(String s, int i, int j){
        int length = s.length();
        for(; i >= 0 && j < length; i--, j++){
            if(s.charAt(i) != s.charAt(j))  break;
        }
        return s.substring(i + 1, j);
    }

    private String longestPalindrome(String s){
        int length = s.length();
        String longestString = "";
        int longest = 0;
        for(int i = 0; i < length; i++){
            String s1 = extend(s, i, i), s2 = extend(s, i, i + 1);
            if(s1.length() > longest){
                longestString = s1;
                longest = s1.length();
            }
            if(s2.length() > longest){
                longestString = s2;
                longest = s2.length();
            }
        }

        return longestString;
    }

}
