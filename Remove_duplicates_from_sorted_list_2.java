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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0,head);
        ListNode prev = temp;
        while(head!=null){
            //to skip duplicates
            if(head.next!=null && head.val == head.next.val)   
            {
                //only moving head forward until same values;
                while(head.next!=null && head.val == head.next.val)
                {
                    head = head.next;
                }
                prev.next = head.next;
            }
            else{
                //if not same we are moving the prev pointer further so as to mark next distinct val
                prev = prev.next;
            }
            head = head.next;
        }
        return temp.next;
    }
}
