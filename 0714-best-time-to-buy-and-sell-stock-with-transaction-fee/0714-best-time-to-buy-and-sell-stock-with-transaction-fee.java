class Solution {
    public static int f(int []prices, int fee, int index, int buy, int n, int [][]dp){
        if(index == n)return 0;
        if(dp[index][buy] != -1)return dp[index][buy];
        if(buy == 1){
            int take = -prices[index] + f(prices, fee, index+1, 0, n, dp);  //not subtract fee here as it is buy
            int notTake = 0 + f(prices, fee, index +1, 1, n, dp);
            return dp[index][buy] = Math.max(take, notTake);
        }
        else{
            int take = -fee + prices[index] + f(prices, fee, index+1, 1, n, dp);  ///just subtract fee here after selling 
            int notTake = 0 + f(prices, fee, index+1, 0, n, dp);
            return dp[index][buy] = Math.max(take, notTake);
        }
    }
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
        return f(prices, fee, 0, 1, n, dp);
    }
}