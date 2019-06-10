import java.util.Stack;

public class ValidParentheses{

    // https://leetcode.com/problems/valid-parentheses/description/

    private boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            switch(c){
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if(stack.isEmpty() || stack.pop() != c){
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }

}
