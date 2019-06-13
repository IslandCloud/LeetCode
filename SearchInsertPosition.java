/**
 * SearchInsertPosition
 */
public class SearchInsertPosition {

    // https://leetcode.com/problems/search-insert-position/

    public int searchInsert(int[] nums, int target) {
        // int len = nums.length;
        // for(int i = 0; i < len; i++){
        //     if(nums[i] >= target){
        //         return i;
        //     }
        //     if(i == len - 1){
        //         return len;
        //     }
        // }

        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){ return mid;}
            else if(nums[mid] < target) { left = mid + 1;}
            else{ right = mid - 1;}
        }

        return 0;
    }
}