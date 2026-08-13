class Solution {
    public static int f(int n, int dp[]){
        if(n==0)return 0;
        if(n<=2)return 1;
        if(dp[n] != -1)return dp[n];
        return dp[n] = f(n-1, dp) + f(n-2, dp);
    }
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }
}