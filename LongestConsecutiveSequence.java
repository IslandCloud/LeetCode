import java.util.HashMap;

public class LongestConsecutiveSequence{

    // https://leetcode.com/problems/longest-consecutive-sequence/description/

    private int longestConsecutive(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int longest = 0;
        for(int n : nums){
            if(!map.containsKey(n)){
                int left = map.getOrDefault(n - 1, 0);
                int right = map.getOrDefault(n + 1, 0);
                int sum = left + right + 1;
                map.put(n, sum);
                longest = Math.max(longest, sum);

                map.put(n - left, sum);
                map.put(n + right, sum);
            }
        }

        return longest;
    }

}
