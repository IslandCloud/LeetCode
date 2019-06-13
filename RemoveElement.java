/**
 * RemoveElement
 */
public class RemoveElement {

    // https://leetcode.com/problems/remove-element/

    public int removeElement(int[] nums, int val) {
        int len = nums.length, counter = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] != val){
                nums[counter++] = nums[i];
            }
        }

        return counter;
    }
}