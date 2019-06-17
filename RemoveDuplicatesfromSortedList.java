/**
 * RemoveDuplicatesfromSortedList
 */
public class RemoveDuplicatesfromSortedList {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){ return head;}
        ListNode h = head, curr = head;
        int number = head.val;
        head = head.next;
        
        while(head != null){
            // head = head.next;
            if(head.val == number){
                head = head.next;
                continue;
            }
            number = head.val;
            curr.next = head;
            curr = head;
            head = head.next;
        }
        curr.next = null;

        return h;
    }

}