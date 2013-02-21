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
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return false;
        if(root.left==null&&root.right==null&&root.val==sum)
        return true;
        else return hasPathSum(root.right,sum-root.val) || hasPathSum(root.left,sum-root.val);
    }

 
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return false;
        Queue<TreeNode> res=new LinkedList<TreeNode>();
        Queue<Integer>  resum=new LinkedList<Integer>();
        res.add(root);
        resum.add(root.val);
        while(res.size()!=0)
        {
            TreeNode r=res.poll();
            Integer s=resum.poll();
            if(r.left==null&&r.right==null&&s==sum) return true;
            if(r.left!=null){
                res.add(r.left);
                resum.add(r.left.val+s);
            }
            if(r.right!=null){
                res.add(r.right);
                resum.add(r.right.val+s);
            }
            
        }
        return false;
    }
}
