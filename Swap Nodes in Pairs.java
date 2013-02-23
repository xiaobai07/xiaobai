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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null || head.next == null) return head;
        ListNode p=head;
        ListNode q=head.next;
        ListNode r=new ListNode(-1);
        r.next=head;
        head=r;
        while(p!=null&&q!=null)
        {
            p.next=q.next;
            q.next=p;
            r.next=q;
            r=p;
            p=p.next;
            if(p==null) break;
            q=p.next;            
        }
        return head.next;
        
    }
}
