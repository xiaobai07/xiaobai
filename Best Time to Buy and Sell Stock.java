public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length==0) return 0;
        int minprice=prices[0],maxdiff=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice) minprice=prices[i];
            if(prices[i]-minprice>maxdiff) maxdiff=prices[i]-minprice; 
            
        }
        return maxdiff;
    }
}
