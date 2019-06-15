// import java.util.Arrays;

/**
 * MaximumSubarray
 */
public class MaximumSubarray {

    // https://leetcode.com/problems/maximum-subarray/

    public int maxSubArray(int[] nums) { // -2,1,-3,4,-1,2,1,-5,4
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];

        for(int i = 1; i < len; i++){
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

}