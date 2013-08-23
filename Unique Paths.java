public class Solution {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(m ==0 || n ==0) return 0;
        int[][] matrix = new int[m][n];
        for(int i = 0;i < m; i++){
            matrix[i][0] = 1;
            for(int j = 1;j < n; j++){
                if( i == 0){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
            }
        }
        return matrix[m-1][n-1];
    }
}
