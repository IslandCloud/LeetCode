import java.util.Stack;

/**
 * SymmetricTree
 */
public class SymmetricTree {

    // https://leetcode.com/problems/symmetric-tree/

    public boolean isSymmetric(TreeNode root) { // Recursively
        if(root == null){return true;}
        return symHelper(root.left, root.right);
    }

    private boolean symHelper(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){ return true;}
        if((t1 == null && t2 != null) || (t1 != null && t2 == null)){ return false;}
        if(t1.val != t2.val){return false;}

        return symHelper(t1.left, t2.right) && symHelper(t1.right, t2.left);
    }

    public boolean isSymmetric(TreeNode root){
        if(root == null){return true;}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.empty()){
            TreeNode t1 = stack.pop(), t2 = stack.pop();
            if(t1 == null && t2 == null){ return true;}
            if(t1 == null || t2 == null || t1.val != t2.val){ return false;}
            stack.push(t1.left);
            stack.push(t2.right);
            stack.push(t1.right);
            stack.push(t2.left);
        }

        return true;
    }
}