class Solution {
    public static int f(String s1, String s2, int m, int n, int dp[][]){
        if(m <=0 || n <=0)return 0;
        if(dp[m][n] != -1)return dp[m][n];
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return dp[m][n] = 1 + f(s1, s2, m-1, n-1, dp);
        }
        return dp[m][n] =  0 + Math.max(f(s1, s2, m-1, n, dp), f(s1, s2, m, n-1, dp));
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        int dp[][] = new int[s.length() +1][s.length() +1];////made of length +1 as beause to handle base case during Tabulation as leass then 0 sp we do all indices shift by 1 to their right 
        for(int i=0;i<=s.length();i++)Arrays.fill(dp[i], -1);
        String s2 = sb.toString();///i reversed that String and then apply subsequence wala logic so also palindromic match as common in both
        return f(s,s2, s.length(), s2.length(), dp);
    }
}