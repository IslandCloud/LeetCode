/**
 * ImplementstrStr
 */
public class ImplementstrStr{

    // https://leetcode.com/problems/implement-strstr/

    public int strStr(String haystack, String needle) {
        int hay_len = haystack.length(), needle_len = needle.length();
        if(needle_len == 0){
            return 0;
        }
        
        for(int i = 0; i < hay_len - needle_len; i++){
            for(int j = 0; j < needle_len; j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
                if(j == needle_len - 1){
                    return i;
                }
            }
        }

        return -1;
    }
}