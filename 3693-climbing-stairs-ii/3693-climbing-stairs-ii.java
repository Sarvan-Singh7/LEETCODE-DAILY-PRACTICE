class Solution {
    public static int f(int costs[], int index, int dp[]){
        //base case mein 0 hi reurn karo
        if(index == 0)return 0;///as 0 pe bh because ek step niche gaya in (one) named variable
        if(dp[index] != -1)return dp[index];
        int one =  costs[index-1] + 1 + f(costs, index-1, dp);////+1 as only one step so distance of square of it is 1
        int two = Integer.MAX_VALUE;
        int three = Integer.MAX_VALUE;
        if(index >=2){
            ///ispe bhi index-1 as one based indexing
            two = costs[index-1] + f(costs, index-2, dp) + 4; ///as square of 2 is 4
        }
        if(index >=3){
            three = costs[index-1] + f(costs, index-3, dp) + 9;///as square of 3 is 9
        }
        return dp[index] = Math.min(one, Math.min(two, three));
    }
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return f(costs, n, dp);
    }
}