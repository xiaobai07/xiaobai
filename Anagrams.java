import java.util.*;
public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> re=new ArrayList<String>();
        HashMap<String,ArrayList<String>> ang=new HashMap<String,ArrayList<String>>(); 
        for(int i=0;i<strs.length;i++)
        {
            String tmp=sortstring(strs[i]);
            if(!ang.containsKey(tmp)){
                ArrayList<String> v=new ArrayList<String>();
                v.add(strs[i]);
                ang.put(tmp,v);
            }
            else{
                ArrayList<String> has=ang.get(tmp);
                has.add(strs[i]);
            }
        }
        Iterator<ArrayList<String>> i=ang.values().iterator();
        while(i.hasNext()){
            ArrayList<String> t=i.next();
            if(t.size()>=2)
                re.addAll(t);
        }
        return re;
        
    }
    public String sortstring(String s)
    {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
