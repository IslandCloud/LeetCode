import java.util.List;

public class AddTwoNumbers{

    // https://leetcode.com/problems/add-two-numbers/description/

    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2){
        boolean addOne = false;
        ListNode prev = new ListNode(0);
        ListNode root = prev;
        while(l1 != null || l2 != null || addOne){
            int sum = 0;
            if(l1 == null && l2 != null){
                sum = l2.val;
            }else if(l2 == null && l1 != null){
                sum = l1.val;
            }else if(l1 != null){
                sum = l1.val + l2.val;
            }

            if(addOne){
                sum++;
                addOne = false;
            }

            if(sum >= 10){
                addOne = true;
                sum -= 10;
            }

            ListNode cur = new ListNode(sum);
            prev.next = cur;
            prev = cur;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return root.next;
    }

}
