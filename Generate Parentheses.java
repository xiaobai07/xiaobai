public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> res=new ArrayList<String>();
        char[] paren=new char[n+n];
        generatepanren(n,0,0,paren,res);
        return res;
    }
    public void generatepanren(int n,int left,int right,char[] paren,ArrayList<String> res)
    {
        if(left==right&&left==n){
            String s=new String(paren);
            res.add(s);
        }
        if(left<n){
            paren[left+right]='(';
            generatepanren(n,left+1,right,paren,res);
        }
        if(right<left){
            paren[left+right]=')';
            generatepanren(n,left,right+1,paren,res);
        }
    }
}
