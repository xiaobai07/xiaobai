public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(str.length()==0) return 0;
        int index=0,sign=1;
        long sum=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(index<str.length())
        {
            if(str.charAt(index)==' ')
                  index++;
            else break;          
        }
        if(str.charAt(index)=='+') index++;
        else if(str.charAt(index)=='-') {
            sign=-1;
            index++;
        }
        while(index<str.length())
        {
            if(str.charAt(index)>='0'&&str.charAt(index)<='9')
                sum=sum*10+str.charAt(index)-'0';
            else break;
            index++;
        }
        if(sign==-1){
            if(sign*sum<min) return min;
        }
        if(sign*sum>max) return max;
        return (int)(sign*sum);
    }
}
