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
    public int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root==null) return 0;
        else return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
}
public int maxDepth(TreeNode root) {
    // Start typing your Java solution below
    // DO NOT write main() function
    LinkedList<TreeNode> trees=new LinkedList<TreeNode>();
    LinkedList<Integer> depth=new LinkedList<Integer>();
    if(root==null)
        return 0;
    trees.add(root);
    depth.add(1);
    int maxDepth=1;
    while(!trees.isEmpty())
    {
        TreeNode curr_node=trees.remove();
        int curr_depth=depth.remove();
        if(curr_depth>maxDepth)
        {
            maxDepth=curr_depth;
        }
        if(curr_node.left!=null)
        {
            trees.add(curr_node.left);
            depth.add(curr_depth+1);
        }
        if(curr_node.right!=null)
        {
            trees.add(curr_node.right);
            depth.add(curr_depth+1);
        }
    }

    return maxDepth;
}
