public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) return null;
             
            int rootVal = preorder[0];
            TreeNode node = new TreeNode(rootVal);
            int numLeftCh = findIndex(inorder,rootVal);
            int numRightCh = inorder.length - numLeftCh - 1;
             
            if (numLeftCh > 0) {
            node.left = buildTree(Arrays.copyOfRange(preorder,1,numLeftCh+1),
                                             Arrays.copyOfRange(inorder,0,numLeftCh));
            }
            if (numRightCh > 0) {                                
            node.right = buildTree(Arrays.copyOfRange(preorder,numLeftCh+1,preorder.length),
                                             Arrays.copyOfRange(inorder,numLeftCh+1,inorder.length));
            }
            return node;
         
    }
     
    public int findIndex(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }
}
