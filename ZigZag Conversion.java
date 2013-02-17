public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(nRows <= 1) return s;
        StringBuffer res=new StringBuffer();
        int zigsize=2*nRows-2;
        for(int i=0;i<nRows;i++)
           for(int base=i;base<s.length();base+=zigsize)
           {
               res.append(s.charAt(base));
               if(i>0&&i<nRows-1){
                   int index=base+zigsize-2*i;
                   if(index<s.length())
                       res.append(s.charAt(index));
               }
           }
        return res.toString();   
    }
}
