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
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return true;
        return ifmirror(root.left,root.right);
        
    }
    public boolean ifmirror(TreeNode p,TreeNode q){
        
        if(p==null&&q==null) return true;
        else if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        else return ifmirror(p.left,q.right)&&ifmirror(p.right,q.left);
    }
}
