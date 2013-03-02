public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<String>();
        if(s.length() < 4 || s.length() > 12)
                           return res;
        dfs(res,1,"",s);
        return res;
    }
    public void dfs(ArrayList<String> res, int count, String buff, String s){
        if(count==4){
            if(valid(s))
                res.add(buff+s);
            else return;    
        }
        else{
            for(int i =1;i<4 && i<s.length();i++){
                String digits = s.substring(0,i);
                if(valid(digits))
                    dfs(res,count+1,buff+digits+".", s.substring(i));
            }
        }
    }
    public boolean valid(String s){
        if(s.charAt(0)=='0') return s.equals("0");
        int res=Integer.parseInt(s);
        return res>=1&&res<=255;
    }
}
