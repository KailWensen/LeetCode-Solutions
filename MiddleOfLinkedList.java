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
    public ListNode middleNode(ListNode head) 
    {
        ListNode curr = head;
        double c = 0.0;
        while(curr!=null)
        {
            c++;
            curr = curr.next;
        }
        System.out.println(c);
        if(c%2==0) //even size
        {
            c=c/2+1;
            while(c>1 )
            {
                head = head.next;
                c--;
            }
        }
        else//odd size
        {
            c = Math.ceil(c/2);
            while(c>1)
            {
                head = head.next;
                c--;
            }
        }
        return head;
        
    }
}