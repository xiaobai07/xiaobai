public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> res=new ArrayList<Integer>();
        findpath(root,res);
        return res;
    }
    public void findpath(TreeNode root,ArrayList<Integer> res)
    {
        if(root!=null) {
            findpath(root.left,res);
            res.add(root.val);
            findpath(root.right,res);
        }
    }
}
public  ArrayList<Integer> inorderTraversal(TreeNode root) {
            // Start typing your Java solution below
            // DO NOT write main() function
            ArrayList<Integer> res = new ArrayList<Integer>();
            if(root==null) return res;
            
            Stack<TreeNode> s = new Stack<TreeNode>();
            TreeNode cur = root;
            while(!s.isEmpty()||cur!=null){
                if(cur!=null){
                    s.push(cur); 
                    cur=cur.left;
                }else{
                    cur=s.pop();
                    res.add(cur.val);
                    cur=cur.right;
                }
            }
            return res;
        }
