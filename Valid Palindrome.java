public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        s = s.toLowerCase();
        StringBuilder string = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9')
                  string.append(s.charAt(i));
        }
        int start = 0,end = string.length()-1;
        while(start<end){
            if(string.charAt(start)!=string.charAt(end)) return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }
}
