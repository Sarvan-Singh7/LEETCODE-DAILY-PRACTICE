

// class Solution {   ///Memoization Code
//     public int Helper(int[][] matrix, int m, int n, int fixColumnSize, int dp[][]){
//         if(n < 0 || n >= fixColumnSize) return (int)1e9; // Check bounds FIRST
//         if(m == 0) return matrix[m][n];
//         if(dp[m][n]!= Integer.MAX_VALUE) return dp[m][n]; // Now safe to access dp[m][n]

//         int up = matrix[m][n] + Helper(matrix, m - 1, n, fixColumnSize, dp);
//         int upLeft = matrix[m][n] + Helper(matrix, m - 1, n - 1, fixColumnSize, dp);
//         int upRight = matrix[m][n] + Helper(matrix, m - 1, n + 1, fixColumnSize, dp);
//         return dp[m][n] = Math.min(up, Math.min(upLeft, upRight));
//     }

//     public int minFallingPathSum(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int[][] dp = new int[m][n];
//         for(int i = 0; i < m; i++){
//             Arrays.fill(dp[i], Integer.MAX_VALUE);   // INSTEAD OF -1 JUST GIVR INT MAX
//         }
//         int mini = Integer.MAX_VALUE;
//         for(int i = 0; i < n; i++){
//             mini = Math.min(mini, Helper(matrix, m - 1, i, n, dp));
//         }
//         return mini;
//     }
// }



class Solution {     
    ////TABULATION CODE

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        
        ////first to convert m==0 base case to tabulation base case please fill all values of that row
        for(int j=0;j<n;j++){
            dp[0][j] = matrix[0][j];
        }
        ///now by O(N squeare) solved
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up =Integer.MAX_VALUE, upLeft =Integer.MAX_VALUE , upRight =Integer.MAX_VALUE; 
                up = matrix[i][j] + dp[i-1][j];
                if(j >0)upLeft = matrix[i][j] + dp[i-1][j-1];
                if(j + 1 <n)upRight = matrix[i][j] + dp[i-1][j+1];
                dp[i][j] = Math.min(up, Math.min(upLeft, upRight));
            }
        }
        ///now find every column of last row to get desired output
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            mini = Math.min(mini, dp[m-1][i]);
        }
        return mini;
        
    }
}