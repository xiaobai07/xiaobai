import java.util.*;
public class Solution {
    public String simplifyPath(String path) {
        // Start typing your Java solution below
        // DO NOT write main() function
          Stack<String> s= new Stack<String>();
          String str="";
          for(int i = 0; i < path.length(); i++)
          {
             if (path.charAt(i) == '/')
             {
                 if (str.equals(".."))
                 {
                     if (!s.empty())
                         s.pop();
                 }
                 else if (!str.equals(".") && !str.equals(""))
                 {
                     s.push(str);
                 }
 
                 str = "";
             }
             else
             {
                 str += String.valueOf(path.charAt(i));
             }
         }
         
         if (str.equals(".."))
         {
             if (!s.empty())
                 s.pop();
         }
         else if (!str.equals(".") && !str.equals(""))
             s.push(str);
         
         if (s.empty())
             return "/";
        
         String ret="";
         while(!s.empty())
         {
             ret = "/" + s.pop() + ret;
         }
         
         return ret;
    }
}
