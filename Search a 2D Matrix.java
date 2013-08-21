public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int end = row*col-1;
        while(start <= end){
            int mid = (start + end)/2;
            int i = mid/col;
            int j = mid%col;
            int middle = matrix[i][j];
            if(middle == target) return true;
            else if(middle < target)  start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
