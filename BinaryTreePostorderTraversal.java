import java.util.LinkedList;
import java.util.Stack;

/**
 * BinaryTreePostorderTraversal
 */
public class BinaryTreePostorderTraversal {

    // https://leetcode.com/problems/binary-tree-postorder-traversal/

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if(root == null){ return result;}
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while(!s.empty()){
            TreeNode curr = s.pop();
            result.add(0, curr.val);
            if(curr.left != null){ s.push(curr.left);}
            if(curr.right != null){ s.push(curr.right);}
        }

        return result;
    }

}