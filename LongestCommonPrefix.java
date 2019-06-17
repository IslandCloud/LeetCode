/**
 * LongestCommonPrefix
 */
public class LongestCommonPrefix {

    // https://leetcode.com/problems/longest-common-prefix/

    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE, strs_len = strs.length, longest = 0;
        if(strs_len == 0){ return "";}

        for(String s : strs){
            if(s.length() == 0){ return "";}
            min = Math.min(min, s.length());
        }

        while(true){
            if(longest >= min){
                break;
            }
            char c = strs[0].charAt(longest);
            for(int i = 1; i < strs_len; i++){
                if(strs[i].charAt(longest) != c){
                    return strs[0].substring(0, longest);
                }
            }
            longest++;
        }

        return strs[0].substring(0, longest);
    }

}