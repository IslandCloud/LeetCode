import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI{

    // https://leetcode.com/problems/next-greater-element-i/description/

    private static int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};

    private int[] nextGreaterElement(int[] nums1, int[] nums2){
        int total_length = nums2.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < total_length; i++){
            int temp = nums2[i];
            for(int t = i + 1; t < total_length; t++){
                if(nums2[t] > temp){
                    map.put(temp, nums2[t]);
                    break;
                }
            }
            map.put(temp, map.getOrDefault(temp, -1));
        }

        int length = nums1.length;
        int[] result = new int[length];
        for(int i = 0; i < length; i++){
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

}
