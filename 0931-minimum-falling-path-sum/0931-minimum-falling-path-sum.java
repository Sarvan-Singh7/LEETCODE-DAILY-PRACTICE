import java.util.Arrays;

class Solution {
    public int Helper(int[][] matrix, int m, int n, int fixColumnSize, int dp[][]){
        if(n < 0 || n >= fixColumnSize) return (int)1e9; // Check bounds FIRST
        if(m == 0) return matrix[m][n];
        if(dp[m][n]!= Integer.MAX_VALUE) return dp[m][n]; // Now safe to access dp[m][n]

        int up = matrix[m][n] + Helper(matrix, m - 1, n, fixColumnSize, dp);
        int upLeft = matrix[m][n] + Helper(matrix, m - 1, n - 1, fixColumnSize, dp);
        int upRight = matrix[m][n] + Helper(matrix, m - 1, n + 1, fixColumnSize, dp);
        return dp[m][n] = Math.min(up, Math.min(upLeft, upRight));
    }

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            mini = Math.min(mini, Helper(matrix, m - 1, i, n, dp));
        }
        return mini;
    }
}