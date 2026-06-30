class Solution {
    public static int f(String s1, String s2, int m, int n, int dp[][]){
        for(int i=1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int minDistance(String word1, String word2) {
        ////similar to lenth of lonest common subsequence;
        int m = word1.length(), n= word2.length();
        int dp[][] = new int[word1.length() +1 ][word2.length() +1];
        int answer =  f(word1, word2, word1.length(), word2.length(), dp);
        
        return (n+m) -  (2*answer);
    }
}