public class Solution {
    public void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean row=false;
        boolean col=false;
        int nc=matrix.length;
        int nr=matrix[0].length;
        for(int i=0;i<nc;i++)
        {
            if(matrix[i][0]==0) {col=true;break;}
        }
        for(int i=0;i<nr;i++)
        {
            if(matrix[0][i]==0) {row=true;break;}
        }
        for(int i=1;i<nc;i++)
           for(int j=1;j<nr;j++)
           {
               if(matrix[i][j]==0){
                   matrix[i][0]=0;
                   matrix[0][j]=0;
               }
           }
        for(int i=1;i<nc;i++)
        {
            if(matrix[i][0]==0){
               for(int j=0;j<nr;j++)
                {
                    matrix[i][j]=0;
                } 
            }
        }
        for(int i=1;i<nr;i++)
        {
            if(matrix[0][i]==0){
               for(int j=0;j<nc;j++)
                {
                    matrix[j][i]=0;
                } 
            }
        }
        if(row){
            for(int i=0;i<nr;i++)
            {
                matrix[0][i]=0;
            }
        }
        if(col){
            for(int i=0;i<nc;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}
