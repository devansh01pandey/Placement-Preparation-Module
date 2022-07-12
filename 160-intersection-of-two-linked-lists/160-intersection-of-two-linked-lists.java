/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1 = 0 , c2 = 0;
        ListNode curr = headA;
        while(curr!=null)
        {
            c1++;
            curr = curr.next;
        }
        curr = headB;
        while(curr != null)
        {
            c2++;
            curr = curr.next;
        }
        ListNode curr1 = headA;
        ListNode curr2 = headB;
        if(c1>c2)
        {
            for(int i =0;i<c1-c2;i++)
                curr1 = curr1.next;            
        }
        else
        {
            for(int i =0;i<c2-c1;i++)
                curr2 = curr2.next;
        }
        while(curr1 != null)
        {
            if(curr1 == curr2)
                return curr1;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
        
    }
}