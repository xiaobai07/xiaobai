import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Character> res=new ArrayList<Character>();
        int max=0,j=0;
        while(j<s.length())
        {
            if(!res.contains(s.charAt(j)))
            {
                res.add(s.charAt(j));
                j++;
            }
            else{
                if(res.size()>max) max=res.size();
                res.remove(0);
            }
        }
        if(res.size()>max) max=res.size();
        return max;
    }
}
