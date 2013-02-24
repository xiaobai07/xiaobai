public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(1);
        for(int i=0;i<=rowIndex;i++){
            if(i>0){
                for(int j=res.size()-1;j>=1;j--){
                    res.set(j,res.get(j)+res.get(j-1));   
                }  
                res.add(1);
            }                        
        }
        return res;
    }
}
