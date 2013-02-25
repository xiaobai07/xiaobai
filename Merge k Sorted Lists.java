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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode head=null;
        int n=lists.size();
        if(n==0) return null;
        for(int i=0;i<n;i++){
            head=mergetwo(head,lists.get(i));
            
        }
        return head;
        
    }
    public ListNode mergetwo(ListNode l1,ListNode l2)
    {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head=l1.val<l2.val?l1:l2;
        ListNode h=new ListNode(-1);
        while(l1!=null&&l2!=null)
        {
            if(l1.val<l2.val){
                h.next=l1;
                l1=l1.next;
                h=h.next;
                
            }
            else{
                h.next=l2;
                l2=l2.next;
                h=h.next;
            }
        }
        if(l1==null) h.next=l2;
        if(l2==null) h.next=l1;
        return head;
    }
}
