public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(triangle==null) return 0;
        int n=triangle.size();
        if(n==1) return triangle.get(0).get(0);
        int[] dp=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=triangle.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
               dp[j]=triangle.get(i).get(j)+Math.min(dp[j],dp[j+1]);
        }
        return dp[0];
        
    }
}
