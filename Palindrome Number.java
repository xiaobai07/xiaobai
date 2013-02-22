public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String a=Integer.toString(x);
        int i=0;int j=a.length()-1;
        while(i<j)
        {
            if(a.charAt(i)==a.charAt(j)) {i++;j--;}
            else return false;
        }
        return true;
    }
}
