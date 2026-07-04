// ///int htis Problem p is a Pattern String  so consider it as Pattern String
// class Solution {    /////Recursion Code
//     public boolean f(String s, String p, int i, int j){
//         //if both String element exhausted then return true as valid TRUE
//         if(i < 0 && j<0)return true;
//         //if pattern String exhausted then no chance that String will match so FALSE
//         if(j< 0 && i>=0)return false; 
//         //if somehow Pattern String remains then as we can say "*" asterik can also valid with empty String so if all asterik  remainin then it will match with empty String as it can match with any
//         if(i<0 && j>=0){
//             for(int k=0; k<=j;k++){
//                 if(p.charAt(k) != '*'){
//                     return false;
//                 }
//             }
//             return true; //if all Asterik remaining in Pattern String so return TRUE
//         }

//         if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){ //if String Match or '?' so we can reduce both from back
//             return f(s, p, i-1, j-1);
//         }
//         else if (p.charAt(j) == '*'){   //if Asterik we can reduce 
//             return f(s, p, i, j-1) || f(s, p, i-1, j);
//             //as we know * can match with an empty part or block of characters, (i, j-1) means * ko hi reduce kiya eans it matches with no part in s and (i-1, j) means that it matches with an part in s so || used so any true can validate
//         }
//         else{
//             return false;   //if no Match so simply return false on it
//         }
//     }
//     public boolean isMatch(String s, String p) {
//       return f(s, p, s.length() -1, p.length() -1);   
//     }
// }


// class Solution {   == MEMOIZATION CODE
//     public boolean f(String s, String p, int i, int j, int [][] dp){
//          if( i<0 && j<0)return true;
//          if(i>=0 && j<0)return false;
//          if(i<0 && j>=0){
//             for(int k=0; k<=j;k++){
//                 if(p.charAt(k) != '*') return false;  ///its p.charAt(k), not s
//             }
//             return true;
//          }
//          if(dp[i][j] != -1)return dp[i][j] == 1;
         
//          if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') dp[i][j] = f(s, p, i-1, j-1, dp) ? 1 : 0;  //not return here as will thorow erroe
//          else if(p.charAt(j) == '*'){
//             dp[i][j] = (f(s, p, i-1, j, dp) || f(s, p, i, j-1, dp)) ? 1 : 0; ///Main Recursion for Choice between Match Block and match empty String
//          }
//          else{
//             dp[i][j] = false ? 1 : 0;
//          }
//          return dp[i][j] == 1; ///return from here as we are storing first 
        
//     }
//     public boolean isMatch(String s, String p) {
//       int dp[][] = new int[s.length()][p.length()];
//       for(int i=0;i<s.length();i++) Arrays.fill(dp[i], -1);
//       return f(s, p, s.length() -1, p.length() -1, dp);   
//     }
// }



class Solution {
    public boolean f(String s, String p, int m, int n, boolean [][] dp){
        dp[0][0] = true;
        for(int i= 1; i<=m;i++) dp[i][0] = false;
        // Base case: String is empty, pattern can only match if it consists purely of '*'
        for(int j = 1; j <= n; j++){
            if(p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            } else {
                dp[0][j] = false;
            }
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if ( p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[m][n];
    }
    public boolean isMatch(String s, String p) {
      boolean dp[][] = new boolean[s.length()+1][p.length()+1];  //boolean array so by default all false (if Boolean so by default all null)
      return f(s, p, s.length(), p.length(), dp);     //size of DP array increase by 1 so to handle negative indices by array shifting 
    }
}