import java.util.Deque;
import java.util.LinkedList;

/**
 * RemoveAllAdjacentDuplicatesInString
 */
public class RemoveAllAdjacentDuplicatesInString {

    // https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
    
    public String removeDuplicates(String S) {
        String t = S;
        int len = t.length();
        Deque<Character> dq = new LinkedList<>(); //"abbaca"
        for(int i = 0; i < len; i++){
            Character c = t.charAt(i);
            if(dq.isEmpty() || dq.peek() != c){
                dq.push(c);
            }else{
                dq.pop();
            }
        }

        char[] res = new char[dq.size()];
        int i = 0;
        while(!dq.isEmpty()){
            res[i] = dq.pollLast();
            i++;
        }

        return new String(res);
    }

}