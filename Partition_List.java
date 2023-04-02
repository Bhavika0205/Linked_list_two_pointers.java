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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode l1 = small;
        ListNode big = new ListNode(0);
        ListNode l2 = big;
        
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                l1.next = temp;  //we conect the new list to the curr node
                l1 = l1.next; // we are noe on the curr node
            }
            else{
                l2.next = temp;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        l2.next = null;
        l1.next = big.next;
        return small.next;
    }
}
