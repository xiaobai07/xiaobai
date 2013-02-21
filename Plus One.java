public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int carry=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int bit=digits[i]+carry;
            if(bit>=10){
                digits[i]=bit-10;
                carry=1;
            }
            else {
                digits[i]=bit;
                carry=0;
            }
        }
        if(carry==0) return digits;
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        for(int i=0;i<digits.length;i++)
            arr[i+1]=digits[i];
        return arr;    
    }
}
