public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m=matrix.length;
        int n=matrix[0].length;
        if(target<matrix[0][0]||target>matrix[m-1][n-1]) return false;
        int i=0,row=0;
        for(i=0;i<m;i++)
        {
            if(matrix[i][0]==target) return true;
            else if(matrix[i][0]>target) break;
        }
        row=i-1;
        int start=0,end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]>target) end=mid-1;
            else if(matrix[row][mid]<target) start=mid+1;
        }
        return false;
    }
}
