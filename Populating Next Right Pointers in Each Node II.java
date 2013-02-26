/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
import java.util.*; 
public class Solution {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return;
        LinkedList<TreeLinkNode> res=new LinkedList<TreeLinkNode>();
        ArrayList<TreeLinkNode> level=new ArrayList<TreeLinkNode>();
        int current=1,next=0;
        res.add(root);
        while(res.size()!=0)
        {
            TreeLinkNode r=res.poll();
            level.add(r);
            current--;
            if(r.left!=null){
                res.add(r.left);
                next++;
            }
            if(r.right!=null){
                res.add(r.right);
                next++;
            }
            if(current==0){
                TreeLinkNode head=level.get(0);
                for(int i=1;i<level.size();i++)
                {
                    head.next=level.get(i);
                    head=level.get(i);
                }
                head.next=null;
                current=next;
                next=0;
                level.clear();
            }
        }
    }
}
