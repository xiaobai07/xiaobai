public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length<=2) return A.length;
        int i=0,j=1,count=1;
        for(j=1;j<A.length;j++)
        {
            if(A[j]==A[i])
            {
                count++;
            }
            else{
                if(count>=2) {
                    A[i+1]=A[i];
                    i+=2;
                    A[i]=A[j];
                    count=1;
                }
                else{
                    i++;
                    A[i]=A[j];
                }
            }
        }
        if(count>=2) {A[i+1]=A[i];return i+2;}
        else  return i+1;
    }
}
