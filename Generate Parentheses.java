public class Solution {  
    public ArrayList<String> generateParenthesis(int n) {  
        // Start typing your Java solution below  
        // DO NOT write main() function  
        ArrayList<String> res = new ArrayList<String>();  
        if (n<=0) return res;  
        dfs(res,"",n,n);  
        return res;  
    }  
      
    public void dfs(ArrayList<String> res, String tmp, int left, int right){  
        if (left==0&&right==0){  
            res.add(tmp);  
            return;  
        }  
        if (left>0) dfs(res,tmp+'(',left-1,right);  
        if (left<right) dfs(res,tmp+')',left,right-1);  
    }  
}
