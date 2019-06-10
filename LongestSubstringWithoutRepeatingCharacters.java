public class LongestSubstringWithoutRepeatingCharacters{

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

    private static String s = "abcabcabccc!@#accc";

    private int lengthOfLongestSubstring(String s){
        int longest = 0;
        int length = s.length();
        int[] set = new int[256];
        for(int i = 0; i < 256; i++){
            set[i] = -1;
        }

        int start = 0;
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            while(set[c] != -1){
                set[s.charAt(start)] = -1;
                start++;
            }
            set[c] = i;
            longest = Math.max(longest, i - start + 1);
        }

        return longest;
    }

}
