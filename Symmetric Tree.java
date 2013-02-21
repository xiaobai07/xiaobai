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

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return true;
        LinkedList<TreeNode> l=new LinkedList<TreeNode>();
        LinkedList<TreeNode> r=new LinkedList<TreeNode>();
        l.add(root.left);
        r.add(root.right);
        while(l.size()!=0&&r.size()!=0)
        {
            TreeNode left=l.poll();
            TreeNode right=r.poll();
            if(left==null&&right==null);
            else if(left==null||right==null) return false;
            else if(left.val!=right.val) return false;
            else {
                l.add(left.left);
                l.add(left.right);
                r.add(right.right);
                r.add(right.left);
            }
        }
        if(l.size()!=0||r.size()!=0) return false;
        return true;
    }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
    // Start typing your Java solution below
    // DO NOT write main() function
    if (root == null)
        return true;

    Stack<TreeNode> s1 = new Stack<TreeNode>();
    Stack<TreeNode> s2 = new Stack<TreeNode>();

    s1.push(root.left);
    s2.push(root.right);

    while (!s1.isEmpty() && !s2.isEmpty()) {
        TreeNode n1 = s1.pop();
        TreeNode n2 = s2.pop();
        if (n1 == null && n2 == null)
        continue;
        else if (n1 == null || n2 == null || n1.val != n2.val)
        return false;
        else {
        s1.push(n1.left);
        s1.push(n1.right);
        s2.push(n2.right);
        s2.push(n2.left);
        }
    }

    if (!s1.isEmpty() || !s2.isEmpty())
        return false;
    else
        return true;
    }
}
