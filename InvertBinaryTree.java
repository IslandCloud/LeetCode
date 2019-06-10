public class InvertBinaryTree{

    // https://leetcode.com/problems/invert-binary-tree/description/

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    private TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;

        return root;
    }

}
