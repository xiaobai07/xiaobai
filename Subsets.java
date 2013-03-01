public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n=S.length;
        ArrayList<Integer> col = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> re = new ArrayList<ArrayList<Integer>>();
        re.add(col);
        Arrays.sort(S);
        for(int i=1;i<=n;i++)
            getlist(S,i,col,re,0);    
        return re;
    }
    
    public void getlist(int[] s, int k, ArrayList<Integer> col, ArrayList<ArrayList<Integer>> re, int start){
        if(col.size()==k){
            ArrayList<Integer> t = new ArrayList<Integer>(col);
            re.add(t);
            return;
        }
        
        for(int i=start; i<s.length; i++){
            col.add(s[i]);
            getlist(s,k,col,re,i+1);
            col.remove(col.size()-1);
        }
        
    }
    
}
