public class TrimABinarySearchTree{

    // https://leetcode.com/problems/trim-a-binary-search-tree/description/

    private static TreeNode root = new TreeNode(3);

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    private TreeNode trimBST(TreeNode root, int L, int R){
        if(root == null){
            return null;
        }

        if(root.val < L){
            return trimBST(root.right, L, R);
        }

        if(root.val > R){
            return trimBST(root.left, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }

}
