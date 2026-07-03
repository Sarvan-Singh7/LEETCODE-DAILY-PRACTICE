
// class Solution {   //Memoizattion code
//     public static int f(String s1, String s2, int i, int j, int dp[][]){
//         if(i<0)return j+1;
//         if(j<0)return i+1;
//         if(dp[i][j] != -1)return dp[i][j];
//         if(s1.charAt(i) == s2.charAt(j) ){
//             return dp[i][j] = f(s1, s2, i-1, j-1, dp);
//         }
//         else{
//             return  dp[i][j] =  1 + Math.min(f(s1, s2, i-1, j-1, dp), Math.min(f(s1, s2, i-1, j, dp), f(s1, s2, i, j-1, dp)));
//                                             //replace                        //delete                   //insert
//         }
//     }
//     public int minDistance(String word1, String word2) {
//         int m = word1.length();
//         int n = word2.length();
//         int dp[][] = new int[m][n];
//         for(int i=0;i<m;i++)Arrays.fill(dp[i], -1);
//         return f(word1, word2, m-1, n-1, dp);
//     }
// }


class Solution {
    public static int f(String s1, String s2, int m, int n, int dp[][]){
        
        for(int j=0; j<=n;j++){
            dp[0][j] = j;
        }
        for(int i=0; i<=m;i++){
            dp[i][0] = i;   ///as index shift hue so that i and j daal diya
        }
        for(int i=1;i<=m;i++){
            for(int j=1; j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] =  1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));  /// +1 is mendatory as we are countong minimum
                }
            }
        }
        return dp[m][n];
    }
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m+1][n+1];   //incerease size to handle negative index -1
        
        return f(word1, word2, m, n, dp);   //pass m, n instead of m-1, n-1 as we will compare with i-1, j-1
    }
}

