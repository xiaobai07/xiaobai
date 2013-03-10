public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<String>> all=new ArrayList<ArrayList<String>>();
        ArrayList<String> al=new ArrayList<String>();
        dfs(s,0,al,all);
        return all;
    }
    public boolean isPalin(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }    
        return true;
    }
    public void dfs(String s, int start, ArrayList<String> al,ArrayList<ArrayList<String>> all){
        if(start==s.length()){
            all.add(new ArrayList<String>(al));
            return;
        }
        for(int i=start+1;i<=s.length();i++){
            if(isPalin(s,start,i-1)){
                al.add(s.substring(start,i));
                dfs(s,i,al,all);
                al.remove(al.size()-1);
            }
        }    
    }
}
