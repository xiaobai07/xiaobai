public class Solution {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(m==0 || n==0) return 0;
        if(m==1 || n==1) return 1;        
        int[][] path = new int[m][n];        
        for(int i=0;i<n;i++)
        {
            path[m-1][i]=1;
        }
        for(int i=0;i<m;i++)
        {
            path[i][n-1]=1;
        }
        for(int i=m-2;i>=0;i--)
           for(int j=n-2;j>=0;j--)
           {
              path[i][j]=path[i+1][j]+path[i][j+1];
           }   
        return path[0][0];   
    }
}
