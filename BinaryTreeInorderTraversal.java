import java.util.LinkedList;
import java.util.List;

/**
 * BinaryTreeInorderTraversal
 */
public class BinaryTreeInorderTraversal {

    // https://leetcode.com/problems/binary-tree-inorder-traversal/

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root == null){ return result;}
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(!s.empty() || curr != null){
            if(curr != null){
                s.push(curr);
                curr = curr.left;
            }else{
                TreeNode t = s.pop();
                result.add(t.val);
                curr = t.right;
            }
        }

        return result;
    }
    
}