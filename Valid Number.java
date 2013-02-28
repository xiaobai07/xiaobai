public class Solution {
    public boolean isNumber(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String sp=s.trim();
        if(sp.length()==0) return false;
        boolean hasdot=false;
        boolean hase=false;
        boolean hasnum=false;
        int i=0;
        if(sp.charAt(i)=='+'||sp.charAt(i)=='-') i++;
        else if(sp.charAt(i)=='e') return false;
        for(;i<sp.length();i++)
        {
            if(sp.charAt(i)=='.')
            {
                if(hasdot) return false;
                else  hasdot=true;
            }
            else if(sp.charAt(i)>='0'&&sp.charAt(i)<='9') hasnum=true;
            else if(sp.charAt(i)=='e')
                 {
                     if(!hasnum||hase||i==sp.length()-1||((i==sp.length()-2)&&(sp.charAt(i+1)=='+'||sp.charAt(i+1)=='-')))
                        return false;
                     else {
                               if(sp.charAt(i+1)=='+'||sp.charAt(i+1)=='-') i++;
                               hase=true;
                               hasdot=true;
                     }    
                 }
            else return false;                       
        }
        if(hasnum) return true;
        else return false;
    }
}
