public class Solution {  
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {  
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();  
        ArrayList<Integer> tmp = new ArrayList<Integer>();  
        Arrays.sort(candidates);  
        dfs(res,tmp,candidates,target,0);  
        return res;  
    }  
      
    public void dfs(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, int[] cand, int target, int pos){  
        if(target<0) return;  
        if(target==0){  
            res.add(new ArrayList<Integer>(tmp));  
            return;  
        }  
        for(int i=pos; i<cand.length; i++){  
            tmp.add(cand[i]);  
            dfs(res,tmp,cand,target-cand[i],i);  
            tmp.remove(tmp.size()-1);  
        }  
    }  
}  
