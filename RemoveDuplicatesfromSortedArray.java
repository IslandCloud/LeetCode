/**
 * RemoveDuplicatesfromSortedArray
 */
public class RemoveDuplicatesfromSortedArray {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public int removeDuplicates(int[] nums) {
        int len = nums.length, counter = 1;
        if(len == 0){
            return 0;
        }
        for(int i = 1; i < len; i++){
            if(nums[i - 1] != nums[i]){
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }
}