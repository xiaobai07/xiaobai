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
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        if(root.left==null) return 1+minDepth(root.right);
        if(root.right==null) return 1+minDepth(root.left);
        else return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}
public class Solution {
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
       if(root==null) return 0;      
       ArrayList<TreeNode> last =new ArrayList<TreeNode>();
       last.add(root);
       int count=1;
       while(!last.isEmpty()){           
        ArrayList<TreeNode> curr = new ArrayList<TreeNode>();
        for(TreeNode n:last){
           if(n.left==null && n.right==null) return count;
           if(n.left!=null) curr.add(n.left);
           if(n.right!=null) curr.add(n.right);
        }
        count++;
        last=new ArrayList<TreeNode>(curr);
       }
       return count;
    }
}
