public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 0;
        int i=0;
        for(int j=1;j<A.length;j++)
        {
            if(A[i]!=A[j]) {
                A[i+1]=A[j];
                i++;
            }
            
        }
        return i+1;
        
    }
}
