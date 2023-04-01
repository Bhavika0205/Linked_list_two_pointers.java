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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        int idx = count - n;
        temp = head;
        if(idx == 0)
        {
            head = head.next;
        }
        else{
            for(int i=0;i<idx-1;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
}
