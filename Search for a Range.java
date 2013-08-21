public class Solution {  
    public int[] searchRange(int[] A, int target) {  
        int[] res = new int[2];  
        res[0] = search(A,target);  
        res[1] = search(A,target+1);  
        res[1]--;  
        if (res[0]>res[1]) {  
            res[0] = -1;  
            res[1] = -1;  
        }  
        return res;  
    }  
      
    public int search(int[] A, int target){  
        int end = A.length - 1;  
        int start = 0;  
        while(start<=end){  
            int mid = start + (end - start)/2;  
            if (A[mid] == target){  
                while(mid >0 && A[mid]==A[mid-1])  
                        mid--;  
                return mid;           
            }  
            else if (A[mid] > target) end = mid - 1;  
            else start = mid + 1;  
        }  
        return start;  
    }  
} 

//mid > 0
