public class Solution {
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode q=new ListNode(-1);
        ListNode r=new ListNode(-1);
        ListNode p=head;
        ListNode m=r;
        head=q;
        while(p!=null)
        {
            if(p.val<x){
                q.next=new ListNode(p.val);
                q=q.next;
            }
            else{
                r.next=new ListNode(p.val);
                r=r.next;
            }
            p=p.next;
        }
        q.next=m.next;
        return head.next;
    }
}
