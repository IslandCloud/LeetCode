/**
 * PartitionList
 */
public class PartitionList {

    // https://leetcode.com/problems/partition-list/

    public ListNode partition(ListNode head, int x) {
        ListNode front = new ListNode(0), back = new ListNode(0);
        ListNode front_head = front, back_head = back;
        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                front.next = curr;
                front = front.next;
            }else{
                back.next = curr;
                back = back.next;
            }
            curr = curr.next;
        }
        front.next = back_head.next;
        back.next = null;

        return front_head.next;
    }
}