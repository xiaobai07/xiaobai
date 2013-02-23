public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    ArrayList<ArrayList<Integer>> resSet = new ArrayList<ArrayList<Integer>>();
    findPathSum(root, sum, new ArrayList<Integer>(), resSet);
    return resSet;
}

private void findPathSum(TreeNode root, int sum,
                         ArrayList<Integer> path,
                         ArrayList<ArrayList<Integer>> resSet) {
    if (root == null)  return;
    path.add(root.val);
    if (root.left == null && root.right == null) {
        if (sum == root.val) {
            // has to make a copy, otherwise the content may be changed
            ArrayList<Integer> curPath = new ArrayList<Integer>(path);
            resSet.add(curPath);
        }
    } else {
        findPathSum(root.left, sum - root.val, path, resSet);
        findPathSum(root.right, sum - root.val, path, resSet);
    }
    path.remove(path.size()-1);
}


public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root==null) return res;
        
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        Stack<Integer> accSums = new Stack<Integer>();
        LinkedList<TreeNode> path = new LinkedList<TreeNode>();
        nodes.add(root);
        accSums.add(root.val);
        
        while(!nodes.isEmpty()){            
            TreeNode node = nodes.pop();
            Integer accSum = accSums.pop();
            path.add(node);
            
            if(node.left==null && node.right==null){
                if(accSum==sum){
                    res.add(getPath(path));
                }
                path.remove(path.size()-1);
                while(!nodes.isEmpty() && !path.isEmpty() && path.peekLast().right!=nodes.peek())
                    path.remove(path.size()-1);

            }
            if(node.right!=null){
                nodes.add(node.right);
                accSums.add(accSum+node.right.val);
            }
            
            if(node.left!=null){
                nodes.add(node.left);
                accSums.add(accSum+node.left.val);
            }
        }
        return res;
    }
    
    public ArrayList<Integer> getPath(LinkedList<TreeNode> s){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(TreeNode node:s){
            res.add(node.val);
        }
        return res;
    }
}
