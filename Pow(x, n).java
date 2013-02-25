public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean neg=false;
        if(n==0) return 1.0;
        if(n<0)  {neg=true;n=-n;}
        double result=1.0,power=x;
        while(n>0)
        {
            if(n%2==1)
               result=result*power;
            power*=power;
            n=n/2;
        }
        if(neg) return 1/result;
        return result;
    }
}
