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
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode p=head,q=head.next;
        while(q!=null)
        {
            if(p.val!=q.val){
                p.next=q;
                p=p.next;
            }
            q=q.next;
        }
        p.next=null;
        return head;
    }
}
