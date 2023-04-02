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
        ListNode dummy = new ListNode(0,head);
        ListNode left =head,preL = dummy,right = head,preR = dummy;
        int cnt = 0;
        while(left.next != null)
        {
            cnt++;
            if(cnt==k)  break;
            left = left.next;
            preL = preL.next;
        }
        ListNode curr = left;
        while(curr.next!=null)
        {
            curr = curr.next;
            right = right.next;
            preR = preR.next;
        }
        ListNode temp = left.next;
        //left is the left neighbour of right
        if(left==preR)
        {
            left.next = right.next;
            preL.next  = right;
            right.next = left;
        }
        //left is the right neighbour of right
        else if(right == preL)
        {
            preR.next = left;
            left.next = right;
            right.next = temp;
        }
        else{
            preL.next = right;
            left.next = right.next;
            preR.next  = left;
            right.next = temp;
        }
        return dummy.next;
        
    }
}
