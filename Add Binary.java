public class Solution {
    public String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int al=a.length()-1;
        int bl=b.length()-1;
        int bit=0;
        int temp=0;
        StringBuffer sum=new StringBuffer("");
        while(al>=0||bl>=0)
        {
            if(al>=0&&bl>=0) temp=(a.charAt(al)-'0')+(b.charAt(bl)-'0')+bit;
            else if(al>=0)  temp=(a.charAt(al)-'0')+bit;
                 else       temp=(b.charAt(bl)-'0')+bit;
            if(temp>=2) {bit=1;temp-=2;}
            else bit=0;
            sum.insert(0,Integer.toString(temp));
            temp=0;
            al--;
            bl--;
        }
        if(bit==1) return sum.insert(0,"1").toString();
        else return sum.toString();       
    }
}
