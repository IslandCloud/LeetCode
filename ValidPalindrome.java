/**
 * ValidPalindrome
 */
public class ValidPalindrome {

    // https://leetcode.com/problems/valid-palindrome/

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        if(right == 0){ return true;}
        while(left < right){
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(r)){
                right--;
                continue;
            }
            if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}