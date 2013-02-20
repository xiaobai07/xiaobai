public class Solution {
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int sum=0;
        return travel(root,sum);
        
    }
    public int travel(TreeNode root, int sum)
    {
        if(root==null) return 0;
        sum=sum*10+root.val;
        if(root.left==null&&root.right==null) return sum;
        return travel(root.left,sum)+travel(root.right,sum);
       
    }
}
