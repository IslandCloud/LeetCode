import java.util.HashMap;
/**
 * MajorityElement
 */
public class MajorityElement {

    // https://leetcode.com/problems/majority-element/

    // Idea from http://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html

    public int majorityElement(int[] nums) {
        int len = nums.length;
        int candidate = nums[0], count = 1;
        for(int i = 1; i < len; i++){
            if(count == 0){
                candidate = nums[i];
                count++;
            }else{
                if(nums[i] == candidate){
                    count++;
                }else{
                    count--;
                }
            }   
        }

        return candidate;
    }

}