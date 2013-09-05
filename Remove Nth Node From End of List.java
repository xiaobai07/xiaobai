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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode p=head,q=head;
        int num = n;
        while(num>0)
        {
            q=q.next;
            num--;
        }
        if(q==null&&num==0) return head.next;
        else if(q==null) return null;
        while(q.next!=null)
        {
            q=q.next;
            p=p.next;
        }
        p.next=p.next.next;
        return head;
    }
}
