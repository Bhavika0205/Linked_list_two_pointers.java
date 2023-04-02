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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left =head,right = head;
        int cnt = 0;
      
        //find the starting kth val
        while(left.next != null)
        {
            cnt++;
            if(cnt==k)  break;
            left = left.next;
        }
        // find the ending kth val
        ListNode curr = left;
        while(curr.next!=null)
        {
            curr = curr.next;
            right = right.next;
        }
        //swap their values
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        return head;
    }
}
