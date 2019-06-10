public class BinaryNumberWithAlternatingBits{

    // https://leetcode.com/problems/binary-number-with-alternating-bits/description/

    private boolean hasAlternatingBits(int n){
        String binary = Integer.toBinaryString(n);
        int length = binary.length();
        for(int i = 0; i < length - 1; i++){
            char c1 = binary.charAt(i), c2 = binary.charAt(i + 1);
            if(c1 == c2){
                return false;
            }
        }


        return true;
    }

}
