public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(m==0) return 0;  
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) {
            return 0;
        }
        int[][] path = new int[m][n];
        for(int i = m-1; i >= 0; i--){
            if(obstacleGrid[i][n-1]==1) {path[i][n-1]=0;break;}
            else path[i][n-1] = 1;
        }
        for(int i = n-1; i >= 0; i--){
            if(obstacleGrid[m-1][i]==1) {path[m-1][i]=0;break;}
            else path[m-1][i] = 1;
        }
        for(int i=m-2; i>=0; i--)
            for(int j=n-2; j>=0; j--){
                if(obstacleGrid[i][j]==1) path[i][j]=0;
          	else path[i][j] = path[i+1][j]+path[i][j+1];
        	}
        return path[0][0];
   
    }
}
