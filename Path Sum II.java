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
