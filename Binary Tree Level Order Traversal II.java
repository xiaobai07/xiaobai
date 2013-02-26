/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> bottom=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> value=new ArrayList<Integer>();
        if(root==null) return res;
        queue.add(root);
        int currentlevel=1;
        int nextlevel=0;
        while(queue.size()!=0)
        {
            TreeNode r=queue.poll();
            currentlevel--;
            value.add(r.val);
            if(r!=null){
                if(r.left!=null){
                     queue.add(r.left);nextlevel++;}
                if(r.right!=null){         
                     queue.add(r.right);nextlevel++;}
              
            }
            if(currentlevel==0){
                currentlevel=nextlevel;
                nextlevel=0;
                ArrayList<Integer> v=new ArrayList<Integer>(value);
                res.add(v);
                value.clear();
            }            
        }
        for(int i=res.size()-1;i>=0;i--)
            bottom.add(res.get(i));
        return bottom;
    }
}
