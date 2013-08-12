public class Solution {
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long a = Math.abs((long) dividend), b=Math.abs((long) divisor);
        long[] res= dividePos(a,b);
        long temp = dividend>0&&divisor<0||dividend<0&&divisor>0?-res[0]:res[0];
        return (int) temp;
    }
    
    public long[] dividePos(long a, long b){
        long[] res = new long[2];
        if(a<b){
            res[0]=0;
            res[1]=a;
        }else if(a==b){
            res[0]=1;
            res[1]=0;
        }else{
            long[] temp=dividePos(a>>1,b);
            res[0] = temp[0]<<1;
            res[1] = temp[1]<<1;
            if((a & 1)==1) res[1]+=1;
            if(res[1]>=b){
                res[0]+=1;
                res[1]-=b;
            }
        }
        return res;
    }
}
