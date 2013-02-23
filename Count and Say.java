public class Solution {

    public String countAndSay(int n) {
        if (n<=0)  return null;
        StringBuilder res = new StringBuilder("1");
        while (n> 1) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for (int i=1; i<res.length(); i++) {
                if (res.charAt(i) == res.charAt(i-1)) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(res.charAt(i-1));
                    count = 1; 
                }
            }
            temp.append(count);
            temp.append(res.charAt(res.length()-1));
            res = temp;
            n--;
        }
        return res.toString();
     }
}
