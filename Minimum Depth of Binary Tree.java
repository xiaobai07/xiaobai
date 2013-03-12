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
        if(root==null)
            return 0;
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        Queue <Integer> levelQueue = new LinkedList<Integer>();
        queue.add(root);
        levelQueue.add(1);
        while(queue.size()>0){
            TreeNode current = queue.poll();
            int lastlevel = levelQueue.poll();
            if(current.left==null && current.right==null){
                return lastlevel;
            }
            if(current.left !=null){
                queue.add(current.left);
                levelQueue.add(lastlevel+1);
            }
            if(current.right !=null){
                queue.add(current.right);
                levelQueue.add(lastlevel+1);
            }
            
        }
        return -1;
        
    }
}
