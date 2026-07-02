// class Solution { ////Recursion Code
//     public static int f(String s, String t, int i, int j){
//         if(j<0){
//             return 1; ////as j ko hum last index se decrease kar rahe s1(i) mein dhundke so if it complete means i milgya
//         }
//         if(i<0)return 0; ////agar s mein dhunte dhundte hum negative indices pe aa gaye so just return 0;
//         if(s.charAt(i) == t.charAt(j)){
//             return f(s, t, i-1, j-1) + f(s, t, i-1, j);  /// i-1 wala isliye as agar s ka woh part consider nahin karna hai then
//         }else{
//             return f(s, t, i-1, j);
//         }
//     }
//     public int numDistinct(String s, String t) {
//         int n = s.length(), m = t.length();

//         return f(s, t, n-1, m-1);
//     }
// }

// class Solution {  ///Memoization Code
//     public static int f(String s, String t, int i, int j, int dp[][]){
//         if(j<0){
//             return 1; ////as j ko hum last index se decrease kar rahe s1(i) mein dhundke so if it complete means i milgya
//         }
//         if(i<0)return 0; ////agar s mein dhunte dhundte hum negative indices pe aa gaye so just return 0;
//         if(dp[i][j]!= -1)return dp[i][j];
//         if(s.charAt(i) == t.charAt(j)){
//             return dp[i][j] = f(s, t, i-1, j-1, dp) + f(s, t, i-1, j,dp);  /// i-1 wala isliye as agar s ka woh part consider nahin karna hai then
//         }else{
//             return dp[i][j] = f(s, t, i-1, j,dp);
//         }
//     }
//     public int numDistinct(String s, String t) {
//         int n = s.length(), m = t.length();
//         int dp[][] = new int[n+1][m+1];     //check size is +1
//         for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
//         return f(s, t, n-1, m-1, dp);
//     }
// }





class Solution {  ///Tabulation Code
    public static int f(String s, String t, int n, int m, int dp[][]){
        for(int i=0;i<=n;i++){   /// 0 to n 
            dp[i][0] = 1;
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<= t.length();j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
    public int numDistinct(String s, String t) {
        int n = s.length(), m = t.length();
        int dp[][] = new int[n+1][m+1];
        
        return f(s, t, n, m, dp);
    }
}