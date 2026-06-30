// class Solution {   //Memoization Code
//     public static int f(String s1, String s2, int m, int n, int dp[][]){
//         if(m <=0 || n <=0)return 0;
//         if(dp[m][n] != -1)return dp[m][n];
//         if(s1.charAt(m-1) == s2.charAt(n-1)){
//             return dp[m][n] = 1 + f(s1, s2, m-1, n-1, dp);
//         }
//         return dp[m][n] =  0 + Math.max(f(s1, s2, m-1, n, dp), f(s1, s2, m, n-1, dp));
//     }
//     public int longestPalindromeSubseq(String s) {
//         StringBuilder sb = new StringBuilder(s).reverse();
//         int dp[][] = new int[s.length() +1][s.length() +1];////made of length +1 as beause to handle base case during Tabulation as leass then 0 sp we do all indices shift by 1 to their right 
//         for(int i=0;i<=s.length();i++)Arrays.fill(dp[i], -1);
//         String s2 = sb.toString();///i reversed that String and then apply subsequence wala logic so also palindromic match as common in both
//         return f(s,s2, s.length(), s2.length(), dp);
//     }
// } 

class Solution {    ///Tabulation COde
    public static int f(String s1, String s2, int m, int n, int dp[][]){
        int prev[] = new int[s1.length()+1];
        int curr[] = new int[s1.length()+1];
        //no need to convert base cases first row and column as 0 because in Java its already 0
        for(int i=1;i<=m;i++){ //less than equal to because of 2d array size
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){ //write here i-1 and j-1 because of 0 based indexing in String
                    curr[j] = 1 + prev[j-1];
                }
                else{
                    curr[j] = Math.max(prev[j], curr[j-1]);
                }

            }
            System.arraycopy(curr, 0, prev, 0, m + 1);
        }
        return prev[m];
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        int dp[][] = new int[s.length() +1][s.length() +1];////made of length +1 as beause to handle base case during Tabulation as leass then 0 sp we do all indices shift by 1 to their right 
        String s2 = sb.toString();///i reversed that String and then apply subsequence wala logic so also palindromic match as common in both
        return f(s,s2, s.length(), s2.length(), dp);
    }
} 