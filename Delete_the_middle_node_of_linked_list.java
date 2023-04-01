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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        int c = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            c++;
        }
        int idx = c/2;
        temp = head;
        for(int i =0;i<idx-1;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
