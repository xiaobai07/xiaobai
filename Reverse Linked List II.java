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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode h=new ListNode(-1),cur=null,first=null,p=null;
        h.next=head;
        cur=head;
        head=h;
        int k=n-m;
        while(m>1)
        {
            cur=cur.next;
            h=h.next;
            m--;
        }
        first=cur;
        while(k>=0)
        {
            ListNode next=first.next;
            first.next=p;
            p=first;
            first=next;
            k--;
        }
        h.next=p;
        cur.next=first;
        return head.next;
        
        
    }
}

//Reversing linked list iteratively

void reverse(Node*& head) {
  if (!head) return;
  Node* prev = NULL;
  Node* curr = head;
  while (curr) {
    Node* next = curr->next;
    curr->next = prev;
    prev = curr;
    curr = next;
  }
  head = prev;
}
