public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length()==0) return 0;
        int n=s.length()-1,c=0;;       
        while(n>=0)
        {
            if(s.charAt(n)!=' ') c++;
            if(s.charAt(n)==' '&&c!=0) break;
            n--;
        }
        return c;
    }
}
