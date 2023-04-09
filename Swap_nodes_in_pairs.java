/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1,head); //so as to return the new head
        ListNode dh = dummy;//an iterator before the node to be swapped
        while(dh.next!=null && dh.next.next!=null) // to check if a and b are null or not
        {
            ListNode a = dh.next;     //the first node to be swapped
            ListNode b = dh.next.next;  // the second node to be swapped
            
            dh.next = b;
            a.next = b.next;
            b.next = a;
            dh = a;                 // preparing for the next swap
        }
        return dummy.next;
    }
}
