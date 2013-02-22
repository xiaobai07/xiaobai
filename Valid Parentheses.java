import java.util.*;
public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Character> p=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='(')
                p.push(s.charAt(i));
            else if(p.empty()==true) return false;
            else {
                     char c=p.pop();
                     if((c=='['&&s.charAt(i)==']')||(c=='('&&s.charAt(i)==')')||(c=='{'&&s.charAt(i)=='}'));
                     else return false;
                            
                  }
            
        }
        return p.empty();
    }
}
