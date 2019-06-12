import java.util.List;
import java.util.Stack;

/**
 * BinaryTreePreorderTraversal
 */
public class BinaryTreePreorderTraversal {

    // https://leetcode.com/problems/binary-tree-preorder-traversal/

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if(root == null){ return result;}
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));

        return result;
    }

    public List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> result = new LinkedList<Integer>();
        if(root == null){ return result;}

        Stack<TreeNode> tovisit = new Stack<TreeNode>();
        tovisit.push(root);
        while(!tovisit.empty()){
            TreeNode visiting = tovisit.pop();
            result.add(visiting.val);
            if(visiting.right != null){ tovisit.push(visiting.right);}
            if(visiting.left != null){tovisit.push(visiting.left);}
        }

        return result;
    }
    
}