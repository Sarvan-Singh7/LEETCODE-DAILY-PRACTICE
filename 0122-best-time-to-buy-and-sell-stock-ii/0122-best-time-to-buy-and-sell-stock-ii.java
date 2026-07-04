// class Solution {   ///GREEDY APPROACH    GETS ALLL TEST CASES
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int profit  = 0;
//         for(int i=1;i<n;i++){
//             if(prices[i-1] < prices[i]){
//                 profit += prices[i] - prices[i-1];
//             }
//         }
//         return profit;
//     }
// }


class Solution {
    public static int f(int[] prices, int index, int buy,int n, int dp[][]){
        if(index == n)return 0;
        if(dp[index][buy] != -1)return dp[index][buy];
        if(buy == 0){  //means i can chooe to buy or not
           return dp[index][buy] =  Math.max( -prices[index] + f(prices, index+1, 1, n, dp), 0 + f(prices, index+1, 0, n, dp));
           //means we can buy and minus value added so to add + on sell and make buy variable as 1 so to no but till i make it 0 in sell
        }
        else{
            return dp[index][buy] =  Math.max( prices[index] + f(prices, index+1, 0, n, dp), 0 + f(prices, index +1, 1, n, dp));
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
        return f(prices, 0, 0, n, dp);
    }
}