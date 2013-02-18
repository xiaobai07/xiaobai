import java.util.*;
public class Solution {
    public ArrayList<Integer> findSubstring(String S, String[] L) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(L.length==0||L==null) return null;
        int wordsize=L[0].length();
        int wordnum=L.length;
        int slength=S.length();
        HashMap<String,Integer> word=new HashMap<String,Integer>();
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<wordnum;i++){
            if(!word.containsKey(L[i]))
                 word.put(L[i],1);
            else word.put(L[i],word.get(L[i])+1);         
        }
        for(int i=0;i<=slength-wordsize*wordnum;i++){
            HashMap<String,Integer> tmp=new HashMap<String,Integer>(word);
            for(int j=0;j<wordnum;j++){
                String one=S.substring(i+j*wordsize,i+(j+1)*wordsize);
                if(!tmp.containsKey(one)) break;
                else {
                        if(tmp.containsKey(one)){
                            if(tmp.get(one)-1==0) tmp.remove(one);
                            else tmp.put(one,tmp.get(one)-1);
                        } 
                }    
            }
            if(tmp.size()==0) res.add(i);
        }
        return res;
    }
}
