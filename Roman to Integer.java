import java.util.*;
public class Solution {
    public int romanToInt(String s) {      
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        if(s.length()==1) return map.get(String.valueOf(s.charAt(0)));
        int sum=0,i=0;
        for(;i<=s.length()-2;i++)
        {
            int pre=map.get(String.valueOf(s.charAt(i)));
            if(map.get(String.valueOf(s.charAt(i+1)))>pre)
            {
                sum-=pre;               
            }
            else
            {
                sum+=pre;                
            }
        }
        sum+=map.get(String.valueOf(s.charAt(i)));
        return sum;
    } 
}
