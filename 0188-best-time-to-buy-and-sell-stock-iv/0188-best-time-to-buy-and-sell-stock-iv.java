class Solution {
    public static int f(int[] prices, int index, int buy, int k, int n, int dp[][][]){
        if(index == n || k ==0)return 0;
        if(dp[index][buy][k] != -1)return dp[index][buy][k];

        if(buy == 1){
            int take = -prices[index] + f(prices, index +1, 0, k, n, dp);
            int notTake = 0 + f(prices, index +1, 1, k, n, dp);
            return dp[index][buy][k] = Math.max(take, notTake);
        }
        else{
            int take = prices[index] + f(prices, index+1, 1, k-1, n, dp);///can buy new now and one transaction complete
            int notTake = 0 + f(prices, index+1, 0, k,n, dp);
            return dp[index][buy][k] = Math.max(take, notTake);
        }
    }
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n][2][k+1];///k+1 as also for 0th case
        for(int i=0; i<n;i++){
            for(int j=0;j<=1;j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return f(prices, 0, 1, k, n, dp);
    }
}