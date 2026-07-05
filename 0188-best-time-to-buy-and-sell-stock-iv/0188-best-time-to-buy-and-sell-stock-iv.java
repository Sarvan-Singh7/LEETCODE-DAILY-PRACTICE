// class Solution {   //MEMOIZATION CODE
//     public static int f(int[] prices, int index, int buy, int k, int n, int dp[][][]){
//         if(index == n || k ==0)return 0;
//         if(dp[index][buy][k] != -1)return dp[index][buy][k];

//         if(buy == 1){
//             int take = -prices[index] + f(prices, index +1, 0, k, n, dp);
//             int notTake = 0 + f(prices, index +1, 1, k, n, dp);
//             return dp[index][buy][k] = Math.max(take, notTake);
//         }
//         else{
//             int take = prices[index] + f(prices, index+1, 1, k-1, n, dp);///can buy new now and one transaction complete
//             int notTake = 0 + f(prices, index+1, 0, k,n, dp);
//             return dp[index][buy][k] = Math.max(take, notTake);
//         }
//     }
//     public int maxProfit(int k, int[] prices) {
//         int n = prices.length;
//         int dp[][][] = new int[n][2][k+1];///k+1 as also for 0th case
//         for(int i=0; i<n;i++){
//             for(int j=0;j<=1;j++){
//                 Arrays.fill(dp[i][j], -1);
//             }
//         }
//         return f(prices, 0, 1, k, n, dp);
//     }
// }


class Solution { ///tabulation code
    
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][k+1];///k+1 as also for 0th case   (n+1) size of rows also increase
        ///no need to cover Base cases as Array elements default value is 0;
        for(int i=n-1;i>=0;i--){
            for(int b = 0; b<=1;b++){
                for(int c = 1; c<=k; c++){   ///start from 1 as 0 covered in Base Case
                    if(b == 1){
                        dp[i][b][c] = Math.max((-prices[i] + dp[i+1][0][c]), (0 + dp[i+1][1][c]));
                    }
                    else{
                        dp[i][b][c] = Math.max((prices[i] + dp[i+1][1][c-1]), (0 + dp[i+1][0][c]));
                    }
                }
            }
        }
        return dp[0][1][k];  ///buy =1as we have sold what we want
    }
}