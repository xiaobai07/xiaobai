import java.util.ArrayList;
public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function 
        ArrayList<String> result = new ArrayList<String>();
        char[] str = new char[digits.length()]; 
        lc(digits, 0, result, str);
        return result;
    }
    public void lc(String digits, int level, ArrayList<String> result, char[] str) {
        if (level == digits.length()) {
            result.add(new String(str));
            return;
        }   
        int i = digits.charAt(level)-'0';
        char[] choices = getX(i).toCharArray();
 
 
        for (int j = 0; j < choices.length; j++) {
            str[level] = choices[j];
            lc(digits, level+1, result, str);
        }
    }
 
    public String getX (int i) {
        String[] arr = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return arr[i];
    }
}
