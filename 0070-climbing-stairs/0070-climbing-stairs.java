// class Solution {
//     public int climbStairs(int n) {
//         if(n==0 || n==1)return 1;
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }

///USING MEMOIZATION
class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];//make an array of n+1 so that we store nth index's value;
        dp[0] =1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){  ///go till n as we want to calculate for n
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}