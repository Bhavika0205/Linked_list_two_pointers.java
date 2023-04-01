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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode mid  = middle(head);
        ListNode last = reverse(mid.next);
        //breaking the list from middle
        mid.next = null;
        ListNode curr = head;
        ListNode dummy = last;
        while(curr!=null && dummy!=null)
        {
            ListNode temp1 = curr.next;
            curr.next = dummy;
            ListNode temp2 = dummy.next;
            
            dummy.next = temp1;
            curr = temp1;
            dummy = temp2;
        }
    }
    
    public ListNode middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
