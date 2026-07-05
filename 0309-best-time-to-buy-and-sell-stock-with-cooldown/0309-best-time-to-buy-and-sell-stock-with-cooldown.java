class Solution {
    public static int f(int[] prices, int index, int buy, int n, int dp[][]){
        if(index >= n ) return 0;   ////as >= used because we did index+2 after succesful transaction so can overflow

        if(dp[index][buy] != -1) return dp[index][buy];
        if(buy == 1){
            int take = -prices[index] + f(prices, index +1, 0, n, dp);
            int notTake = 0 + f(prices, index+1, 1, n, dp);
            return dp[index][buy] = Math.max(take, notTake);
        }
        else{
            int take = prices[index] + f(prices, index+2, 1, n, dp);
            int notTake = 0 + f(prices, index+1, 0, n, dp);
            return dp[index][buy] = Math.max(take, notTake);
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
        return f(prices, 0, 1, n, dp);
    }
}