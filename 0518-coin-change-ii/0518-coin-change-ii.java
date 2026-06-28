class Solution {
    public static int f(int []coins, int amount, int index, int dp[][]){
        if(index ==0){
            if(amount % coins[0] ==0)return 1;
            else return 0;
        }
        if(dp[index][amount] != -1)return dp[index][amount];
        int notPick = 0 + f(coins, amount, index -1, dp);
        int pick =0;
        if(amount >= coins[index]){
            pick = f(coins, amount - coins[index], index, dp);//not index -1 as we can take multiple times
        }
        return dp[index][amount] = pick + notPick;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
        return f(coins, amount, n-1, dp);
    }
}