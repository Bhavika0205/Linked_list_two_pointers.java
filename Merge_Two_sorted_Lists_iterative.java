class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if(a==null) return b;
        if(b==null) return a;
        ListNode head = null, tail = null;
        //assigning the head of the linked list
        if(a.val<=b.val)
        {
            head =tail = a;
            a=a.next;
        }
        else{
            head = tail = b;
            b = b.next;
        }
        //iterating the linked list
        while(a!=null && b!=null)
        {
            if(a.val<=b.val)
            {
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else{
                tail .next = b;
                tail = b;
                b = b.next;
            }
        }
        //if one linked list is over
        if(a==null) tail.next = b;
        else tail.next = a;
        return head;
    }
}
