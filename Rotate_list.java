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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next == null)
        {
            return head;
        }
        ListNode temp = head;
        int n = size(head);
        k = k%n;
        if(k==0) return head;
        for(int i=1;i<n-k;i++)
        {
            temp = temp.next;
        }
        //we will find the breakpoint of the list depending on k
        //now we are storing the next of temp so as to not loose the connection
        ListNode store = temp.next;
        //pointing the last element to null
        temp.next = null;
        temp = store;
        //now traversing till we reach the last element of the original list so as to connect it to the head
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = head;
        return store;
    }
    public int size(ListNode head){
        int n = 0;
        while(head!=null)
        {
            head = head.next;
            n++;
        }
        return n;
    }
}
