/**
 * CountandSay
 */
public class CountandSay {

    // https://leetcode.com/problems/count-and-say/

    public String countAndSay(int n) {
        if(n == 1){ return "1";}

        String last_term = countAndSay(n - 1);
        int len = last_term.length(), i = 0;
        String result = "";
        while(i < len){
            char c = last_term.charAt(i);
            int counter = 1;
            while(i++ < len){
                if(i == len){
                    break;
                }

                if(last_term.charAt(i) != c){ break;}
                counter++;
            }
            result += (Integer.toString(counter) + String.valueOf(c));
        }

        return result;
    }

}