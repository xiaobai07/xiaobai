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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head=l1.val>l2.val? l2:l1;
        ListNode tmp=new ListNode(-1);        
        while(l1!=null&&l2!=null)
        {
            if(l1.val>l2.val)
            {
                tmp.next=l2;
                l2=l2.next;
                tmp=tmp.next;
            }
            else
            {

                tmp.next=l1;
                l1=l1.next;
                tmp=tmp.next;
            }
        }
        if(l2==null) tmp.next=l1;
        if(l1==null) tmp.next=l2;
        return head;
        
    }
}
