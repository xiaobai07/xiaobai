public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int i = 1;
        int j = 2;
        
        if(n==1) return 1;
        if(n==2) return 2;
        int p = 3;
        
        for(int k=3; k<=n; k++){
            p = i+j;
            i = j;
            j = p;
            
        }
        
        return p;
        
    }
}
