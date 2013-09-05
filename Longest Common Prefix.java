public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs.length==0) return "";
        String first=strs[0];
        int i=0;
        for(i=0;i<first.length();i++)
        {
            char com=first.charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length()||strs[j].charAt(i)!=com) return first.substring(0,i);
            }
        }
        return first.substring(0,i);
    }
}
