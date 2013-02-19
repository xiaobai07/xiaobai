public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null) return null;
        ListNode p=head,q=head,r=null;
        while(n>0){
            p=p.next;
            n--;
            if(p==null)
               p=head;
        }
        if(p==q) return q;
        while(p.next!=null){
            p=p.next;
            q=q.next;           
        }
        r=q.next;
        q.next=null;
        p.next=head;
        return r;
    }
}
