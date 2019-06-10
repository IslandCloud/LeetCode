public class ZigZagConversion{

    // https://leetcode.com/problems/zigzag-conversion/description/

    private static String s = "PAYPALISHIRING";
    private static int numRows = 4;

    private String convert(String s, int numRows){
        int length = s.length();
        if(numRows == 1){
            return s;
        }
        StringBuilder[] stringlist = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            stringlist[i] = new StringBuilder();
        }
        int counter = numRows + numRows - 2;
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            int div = i % counter;
            if(div < numRows){
                stringlist[div].append(c);
            }else{
                stringlist[counter - div].append(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            result.append(stringlist[i]);
        }

        return result.toString();
    }

}
