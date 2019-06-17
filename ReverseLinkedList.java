/**
 * ReverseLinkedList
 */
public class ReverseLinkedList {

    // https://leetcode.com/problems/reverse-linked-list/

    public ListNode reverseList(ListNode head){ // Recursively
        if(head == null ||head.next == null){
            return head;
        }

        ListNode reverse_head = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reverse_head;
    }

    public ListNode reverseList(ListNode head){ // Iteratively
        ListNode prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}