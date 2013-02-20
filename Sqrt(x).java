public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x>=0)
        {
            long left=0;
            long right=x;
            long mid=0;
            while(left<=right)
            {
                mid=left+(right-left)/2;
                long tmp=mid*mid;
                if(tmp<mid){
                    right=mid-1;
                }
                else if(tmp==x){
                    return (int)mid;
                }
                else if(tmp<x){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
                
            }
            return (int)right;
        }
        return -1;
    }
}

public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x==0) return 0;
        if(x<0)  return -1;
        double y=(double)x/2;
        while(Math.abs(y*y-x)>0.00001){
            y=(y+x/y)/2;
        }
        return (int)y;
    }
}
