import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindAndReplacePattern{

    // https://leetcode.com/problems/find-and-replace-pattern/description/

    private static String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
    private static String pattern = "abb";

    private List<String> findAndReplacePattern(String[] words, String pattern){
        List<String> list = new LinkedList<>();
        int length = pattern.length();
        for(String s : words){
            boolean add = true;
            if(s.length() != length){
                continue;
            }
            HashMap<Character, Character> map = new HashMap<>();
            for(int i = 0; i < length; i++){
                char c = pattern.charAt(i);
                if(!map.containsKey(c)){
                    if(map.containsValue(s.charAt(i))){
                        add = false;
                        break;
                    }
                    map.put(c, s.charAt(i));
                }else{
                    if(map.get(c) != s.charAt(i)){
                        add = false;
                        break;
                    }
                }
            }
            if(add){
                list.add(s);
            }
        }

        return list;
    }

}