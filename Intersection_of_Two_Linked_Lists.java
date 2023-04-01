// first we will find the length's of both the linked lists
// then we will find the the difference between both the lengths
// ab badi wali ll ko difference jitna move kro ab dono ll intersection se equal difference pe hai
// ab dono linked list ko move kro same time pe jb tk dono equal na ho 
// end mein koi bhi ek return krdo this will either give us the poinnt of intersection or null




public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        int n =0,m =0;
        while(headA!=null)
        {
            headA = headA.next;
            n++;
        }
        while(headB!=null)
        {
            headB = headB.next;
            m++;
        }
        int diff = Math.abs(m-n);
        if(n>m)
        {
            for(int i=0;i<diff;i++)
            {
                A = A.next;
            }
        }
        else{
            for(int i=0;i<diff;i++)
            {
                B = B.next;
            }
        }
        while(A!=B)
        {
            A = A.next;
            B = B.next;
        }
        return A;
    }
}
