import java.util.Arrays;

/**
 * ConvertSortedArraytoBinarySearchTree
 */
public class ConvertSortedArraytoBinarySearchTree {

    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if(len == 0){ return null;}
        TreeNode root = helper(nums, 0, len - 1);
        return root;
    }

    private TreeNode helper(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);

        return root;
    }

}