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
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> value=new ArrayList<Integer>();
        TreeNode cur=root;
        Stack<TreeNode> res=new Stack<TreeNode>();
        if(root==null) return true;
        while(!res.isEmpty()||cur!=null)
        {
            if(cur!=null){
                res.push(cur);
                cur=cur.left;
            }
            else{
                 cur=res.pop();
                 value.add(cur.val);
                 cur=cur.right;
            }
        }
        for(int i=0;i<value.size()-1;i++){
            if(value.get(i+1)<=value.get(i)) return false;
        }
        return true;
        
    }
}
