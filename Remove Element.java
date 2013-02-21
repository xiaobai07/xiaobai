public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 0;
        int i=0;
        for(int j=0;j<A.length;j++){
            if(A[j]!=elem){
                A[i]=A[j];
                i++;
            }
        }
        return i;
    }
}
