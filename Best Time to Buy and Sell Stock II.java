public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int sum=0,i=0;
        while(i<prices.length-1){
            if(prices[i+1]>prices[i]){
                     sum+=(prices[i+1]-prices[i]);
                     
            }
            i++;           
        }
        return sum;
    }
}
