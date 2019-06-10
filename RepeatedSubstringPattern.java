public class RepeatedSubstringPattern{

    // https://leetcode.com/problems/repeated-substring-pattern/description/

    private boolean repeatedSubstringPattern(String s){
        int length = s.length();
        for(int i = length / 2; i >= 1; i--){
            if(length % i == 0){
                StringBuilder compare = new StringBuilder();
                String ss = s.substring(0, i);
                boolean repeat = true;
                for(int j = 0; j < length / i; j++){
                    if(!ss.equals(s.substring(j*i,(j+1)*i))){
                        repeat = false;
                        break;
                    }
                }

                if(repeat){
                    return true;
                }
            }
        }

        return false;
    }

}
