public class Solution {
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<TreeNode> toVisit = new Stack<TreeNode>();
        if(root==null) return;
        toVisit.push(root);
        TreeNode prev = null;
        while(!toVisit.isEmpty()){
            TreeNode cur = toVisit.pop();
            if(cur.right!=null)
                toVisit.push(cur.right);
            if(cur.left!=null)
                toVisit.push(cur.left);
            if(prev!=null){
                prev.left=null;
                prev.right = cur;
            }
            prev=cur;
        }
    }
}

public class Solution {
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        flatten_recurr(root);
        
    }
    public TreeNode flatten_recurr(TreeNode root) {
    if (root == null || (root.left == null && root.right == null))
      return root;

    TreeNode left = root.left;
    TreeNode right = root.right;

    root.left = null;

    if (left != null) {
      root.right = left;
      root = flatten_recurr(left);
    }

    if (right != null) {
      root.right = right;
      root = flatten_recurr(right);
    }

    return root;
  }
}
