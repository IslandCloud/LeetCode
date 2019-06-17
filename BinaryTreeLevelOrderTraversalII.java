import java.util.List;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

/**
 * BinaryTreeLevelOrderTraversalII
 */
public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode> dq = new LinkedList<>();
        dq.push(root);

        List<List<Integer>> result = new LinkedList<>();
        if(root == null){ return result;}
        int counter = 1;

        while(!dq.isEmpty()){
            List<Integer> level = new LinkedList<>();
            while(counter-- > 0){
                TreeNode t = dq.pop();
                if(t.left != null){ dq.add(t.left);}
                if(t.right != null){ dq.add(t.right);}
                level.add(t.val);
            }
            result.add(level);
            counter = dq.size();
        }
        Collections.reverse(result);

        return result;
    }
}