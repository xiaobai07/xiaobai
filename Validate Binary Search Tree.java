public class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        return ifvalid(root,max,min);
        
    }
    public boolean ifvalid(TreeNode root,int max,int min)
    {
        if(root==null) return true;
        if(root.val<=min||root.val>=max) return false;
        else return ifvalid(root.left,root.val,min)&&ifvalid(root.right,max,root.val);
    }
}
