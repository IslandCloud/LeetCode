import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree{

    // https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

    private static TreeNode a = new TreeNode(3);

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    private List<Double> averageOfLevels(TreeNode root){
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> roots = new LinkedList<>();

        if(root == null){
            return null;
        }

        roots.offer(root); // Add the first root into the queue
        while(!roots.isEmpty()){
            double sum = 0.0;
            int size = roots.size(), counter = size;
            while(counter-- > 0){
                TreeNode head = roots.remove();
                sum += head.val;

                if(head.left != null){
                    roots.offer(head.left);
                }
                if(head.right != null){
                    roots.offer(head.right);
                }
            }

            result.add(sum / size);
        }

        return result;
    }

}
