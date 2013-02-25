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
        ListNode p=head,q=head.next,r=new ListNode(-1);
        r.next=head;
        head=r;
        int count=1;
        while(q!=null)
        {
            if(p.val==q.val){
                q=q.next;
                count++;
            }
            else{
                if(count>=2){
                    r.next=q;
                    p=q;
                    q=q.next;
                    count=1;
                }
                else{
                    r=r.next;
                    p=q;
                    q=q.next;
                }
            }
        }
        if(count>=2) r.next=q;
        return head.next;
    }
}
