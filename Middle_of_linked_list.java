// Approach 1:------------------------------------------------------------
//using loop

class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        int size = len(head);
        for(int i=0;i<size/2;i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    public int len(ListNode head){
        int l = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            l++;
        }
        return l;
    }
}

//Approach 2:-----------------------------------------------------------------
//using slow fast pointer

class Solution {
    public ListNode middleNode(ListNode head) {
         ListNode slow = head;
         ListNode fast = head;
         while(fast!=null && fast.next!=null)
         {
             fast = fast.next.next;
             slow = slow.next;
         }
        return slow;
    }    
}
