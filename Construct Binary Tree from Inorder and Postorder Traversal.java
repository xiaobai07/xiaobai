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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(postorder.length==0||inorder.length==0||postorder.length!=inorder.length) return null;
        TreeNode root=new TreeNode(postorder[postorder.length-1]);
        int numleft=findindex(inorder,root.val);
        int numright=numleft+2;
        if(numleft>=0){
            root.left=buildTree(Arrays.copyOfRange(inorder,0,numleft+1),Arrays.copyOfRange(postorder,0,numleft+1));
        }
        if(numright>0){
            root.right=buildTree(Arrays.copyOfRange(inorder,numright,inorder.length),Arrays.copyOfRange(postorder,numleft+1,postorder.length-1));
        }
        return root;
    }
    public int findindex(int[] order,int value)
    {
        for(int i=0;i<order.length;i++)
        {
            if(order[i]==value) return i-1;
        }
        return -1;
    }
}
