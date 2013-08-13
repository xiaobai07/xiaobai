public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A==null || A.length==0)return null;
        int[] res = new int[2];
        res[0]=searchMaxLessThan(A,target,0,A.length-1);
        res[1]=searchMaxLessThan(A,target+1,0,A.length-1);
        if(res[0]==res[1]){
            res[0]=-1;
            res[1]=-1;
        }else{
            res[0]++;
        }
        return res;
    }
    
    public int searchMaxLessThan(int[] A, int target, int start, int end){
        
        if(start==end) return A[start]<target?start:start-1;
        if(start==end-1) return A[end]<target?end:(A[start]<target?start:start-1);
        int mid = (start+end)/2;
        if(A[mid]>=target){
            end=mid-1;
        }else{
            start=mid;
        }
        return searchMaxLessThan(A,target,start,end);
    }
}
