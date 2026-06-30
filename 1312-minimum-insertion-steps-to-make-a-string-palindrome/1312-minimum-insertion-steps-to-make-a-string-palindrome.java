class Solution {   //please see longest palindromic subsequence code for it to solve 
    public static int f(String s1, String s2,int m, int n ,int dp[][]){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
    public int minInsertions(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        String s2 = sb.toString();
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        int longestPalindromeSize = f(s, s2, n, n, dp);
        return n- longestPalindromeSize;
    }
}