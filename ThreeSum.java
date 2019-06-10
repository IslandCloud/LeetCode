import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum{

    // https://leetcode.com/problems/3sum/description/

    private static int[] nums = {-1, 0, 1, 2, -1, -4};

    private List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < length; i++){
            if(nums[i] > 0){
                break;
            }

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1, right = length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < length - 1 && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(right > 0 && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return result;
    }

}
