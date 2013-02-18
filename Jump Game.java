public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int index=0;
        while(index<A.length){
            int i=A[index];
            if(index==A.length-1&&i==0) return true;
            else if(i==0) return false;                    
            index=i+index;            
        }
        return true;
    }
}
