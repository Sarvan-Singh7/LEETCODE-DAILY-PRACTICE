class Solution {
    public static int f(String text1, String text2, int index1, int index2, int dp[][]){//Memoization Code
        if(index1 <0 || index2 <0)return 0;
        if(dp[index1][index2] != -1)return dp[index1][index2];
        if(text1.charAt(index1) == text2.charAt(index2)){
            return dp[index1][index2] = 1 + f(text1, text2, index1 -1, index2 -1, dp);///if they match then both must reduce 
        }
        //come here if no Match
        return dp[index1][index2] = 0 + Math.max(f(text1, text2, index1 -1, index2, dp), f(text1, text2, index1, index2 -1, dp));
    }
   
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)Arrays.fill(dp[i], -1);
        // return f(text1, text2, m -1, n -1, dp );

        ////Tabulation Code

        int dp2[][] = new int[m+1][n+1];///to deal with -1 index as 0th index so increase size
        for(int i=1; i<m+1; i++){
            for(int j=1;j<n+1;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp2[i][j] = 1 + dp2[i-1][j-1];

                }
                else dp2[i][j] = Math.max(dp2[i-1][j] , dp2[i][j-1]);
            }
        }
        return dp2[m][n];

    }
}