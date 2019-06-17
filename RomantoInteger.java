/**
 * RomantoInteger
 */
public class RomantoInteger {

    // https://leetcode.com/problems/roman-to-integer/

    public int romanToInt(String s) {
        int total = 0, len = s.length();
        for(int i = 0; i < len - 1; i++){
            int n1 = getRoman(s.charAt(i)), n2 = getRoman(s.charAt(i + 1));
            total += (n1 < n2 ? -n1 : n1);
        }
        total += getRoman(s.charAt(len - 1));

        return total;
    }

    private int getRoman(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}