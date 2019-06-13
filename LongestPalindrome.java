/**
 * LongestPalindrome
 */
public class LongestPalindrome {

    // https://leetcode.com/problems/longest-palindrome/

    public int longestPalindrome(String s) {
        int[] alphabet = new int[26 * 2];
        int len = s.length();
        for(int i = 0; i < len; i++){
            int t = s.charAt(i) - 'A';
            if(t < 26){ // 'A'-'Z'
                alphabet[t]++;
            }else{      // 'a'-'z'
                alphabet[t - 6]++;
            }
        }

        int res = 0;
        boolean has_odd = false;
        for(int i = 0; i < 26 * 2; i++){
            int t = alphabet[i];
            if(t % 2 == 0){
                res += t;
            }else{
                res += (t - 1);
                has_odd = true;
            }
        }

        return has_odd ? res + 1 : res;
    }
}