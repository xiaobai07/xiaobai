public class Solution {
    public int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n<0) return null;
        int[][] matrix=new int[n][n];
        int i=0,j=n-1,num=1;
        while(i<=j){
            if(i==j){ matrix[i][j]=num;break;}
            
            for(int k=i;k<j;k++)
                 matrix[i][k]=num++;    
            for(int k=i;k<j;k++)
                 matrix[k][j]=num++;
     
            for(int k=j;k>i;k--)
                 matrix[j][k]=num++;
    
            for(int k=j;k>i;k--)
                 matrix[k][i]=num++;              
            i++;
            j--;
        }
        return matrix;
    }
}
