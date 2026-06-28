class Solution {
    // public static int f(int []coins, int amount, int index, int dp[][]){  ////MEMOIZATION
    //     if(index ==0){
    //         if(amount % coins[0] ==0)return 1;
    //         else return 0;
    //     }
    //     if(dp[index][amount] != -1)return dp[index][amount];
    //     int notPick = 0 + f(coins, amount, index -1, dp);
    //     int pick =0;
    //     if(amount >= coins[index]){
    //         pick = f(coins, amount - coins[index], index, dp);//not index -1 as we can take multiple times
    //     }
    //     return dp[index][amount] = pick + notPick;
    // }
    public static int f(int []coins, int amount, int index, int dp[][]){ ///tabulation
        for(int amt = 0; amt <= amount;amt++){
            if(amt % coins[0] == 0) {
                dp[0][amt] = 1;
            }
            else dp[0][amt] = 0;
        }
        for(int i=1;i<coins.length; i++){
            for(int amt = 0; amt <= amount;amt++){
                int notPick = dp[i-1][amt];
                int pick =0;
                if(amt >= coins[i]){
                    pick = dp[i][amt - coins[i]];
                }
                dp[i][amt] = pick + notPick;
            }
        }
        return dp[coins.length-1][amount];
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
        return f(coins, amount, n-1, dp);
    }
}