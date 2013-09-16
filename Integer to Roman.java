public class Solution {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] nu={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] ro={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        StringBuilder rome = new StringBuilder();
        while(num>0)
        {
            while(num>=nu[i]){
                rome.append(ro[i]);
                num-=nu[i];
            }
            i++;
        }
        return rome.toString();
    }
}
