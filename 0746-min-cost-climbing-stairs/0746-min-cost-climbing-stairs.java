class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(f(cost , 0, dp), f(cost, 1, dp));
       // o se ya 1 se start
    }
    public static int f(int cost[], int i, int dp[]){
        if(i == cost.length)return 0;
        int first = Integer.MAX_VALUE;
        
        if(dp[i] != -1)return dp[i];
        if(i<= cost.length - 1){     ///condition pehle hi dedo
            first = cost[i] + f(cost, i+1, dp);
        }
        int second = Integer.MAX_VALUE;

        if(i<= cost.length - 2){
            second = cost[i] + f(cost, i+2, dp);
        }
        return dp[i] = Math.min(first, second);
    }
}