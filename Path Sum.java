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
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<Integer> accSums = new LinkedList<Integer>();
        nodes.add(root);
        accSums.add(root.val);
        
        while(!nodes.isEmpty()){
            TreeNode node = nodes.poll();
            Integer accSum = accSums.poll();
            if(node.left==null && node.right==null && accSum==sum)
                return true;
            if(node.left!=null){
                nodes.add(node.left);
                accSums.add(accSum+node.left.val);
            }
            if(node.right!=null){
                nodes.add(node.right);
                accSums.add(accSum+node.right.val);
            }
        }
        return false;
    }
  }    
}
