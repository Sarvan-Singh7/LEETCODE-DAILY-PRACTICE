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


// class Solution {   ///Memoization Code
//     public static int f(int[] prices, int index, int buy,int n, int dp[][]){
//         if(index == n)return 0;
//         if(dp[index][buy] != -1)return dp[index][buy];
//         if(buy == 0){  //means i can chooe to buy or not
//            return dp[index][buy] =  Math.max( -prices[index] + f(prices, index+1, 1, n, dp), 0 + f(prices, index+1, 0, n, dp));
//            //means we can buy and minus value added so to add + on sell and make buy variable as 1 so to no but till i make it 0 in sell
//         }
//         else{
//             return dp[index][buy] =  Math.max( prices[index] + f(prices, index+1, 0, n, dp), 0 + f(prices, index +1, 1, n, dp));
//         }
//     }
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int dp[][] = new int[n][2];
//         for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
//         return f(prices, 0, 0, n, dp);
//     }
// }

class Solution {   ///Tabulation Code
    
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+1][2];  /// n+1
        for(int ind = n-1; ind>=0; ind--){
            for(int buy = 0; buy <=1; buy++){
                if(buy == 0){
                    dp[ind][buy] = Math.max(( -prices[ind] + dp[ind +1][1]), ( 0 + dp[ind +1][0]));
                }
                else{
                    dp[ind][buy] = Math.max(( +prices[ind] + dp[ind+1][0]), (0 + dp[ind +1][1]));
                }
            }
        }
        return dp[0][0];
    }
}