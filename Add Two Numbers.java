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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode head=new ListNode(-1);
        ListNode current=head;
        int carry=0;
        while(l1!=null||l2!=null)
        {
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            current.next=new ListNode(sum%10);
            carry=sum/10;
            current=current.next;
        }
        if(carry==1) current.next=new ListNode(1);
        return head.next;
    }
}
