import java.util.Arrays;

public class DistributeCandies{

    // https://leetcode.com/problems/distribute-candies/description/

    private static int[] candies = {1,1,2,2,3,3};

    private int distributeCandies(int[] candies){
        int length = candies.length;
        int different_kinds = 1;
        Arrays.sort(candies);
        for(int i = 0; i < length - 1; i++){
            if(candies[i] != candies[i + 1]){
                different_kinds++;
            }
            if(length / 2 <= different_kinds){
                return length / 2;
            }
        }

        return length / 2 <= different_kinds ? length / 2 : different_kinds; }

}
