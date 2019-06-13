/**
 * MergeTwoSortedLists
 */
public class MergeTwoSortedLists {

    // https://leetcode.com/problems/merge-two-sorted-lists/

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // ListNode result = new ListNode(0);
        // ListNode result_head = result;

        // while(l1 != null || l2 != null){
        //     if(l1 == null){
        //         result.next = l2;
        //         return result_head.next;
        //     }
        //     if(l2 == null){
        //         result.next = l1;
        //         return result_head.next;
        //     }

        //     int v1 = l1.val, v2 = l2.val;
        //     if(v1 <= v2){
        //         result.next = l1;
        //         l1 = l1.next;
        //     }else{
        //         result.next = l2;
        //         l2 = l2.next;
        //     }
        //     result = result.next;
        // }

        // return result_head.next;
        if(l1 == null){ return l2;}
        if(l2 == null){ return l1;}
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}