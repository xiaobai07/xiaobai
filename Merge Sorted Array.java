public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int last=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0&&j>=0)
        {
            A[last--]=A[i]>=B[j]?A[i--]:B[j--];
        }
        while(j>=0)  A[last--]=B[j--];
    }
}
