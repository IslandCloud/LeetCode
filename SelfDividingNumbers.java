import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers{

    // https://leetcode.com/problems/self-dividing-numbers/description/

    private static int left = 1;
    private static int right = 22;

    private List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> result = new ArrayList<>();
        for(int n = left; n <= right; n++){
            boolean add = true;
            int temp = n;
            while(temp > 0){
                int t = temp % 10;
                if(t == 0 || n % t != 0){
                    add = false;
                    break;
                }
                temp /= 10;
            }
            if(add){
                result.add(n);
            }
        }
        return result;
    }

}
