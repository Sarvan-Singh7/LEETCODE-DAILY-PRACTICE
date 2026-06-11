class Solution {
    public static int Helper(int[][] grid, int m, int n, int dp[][]){
        if(m==0 && n==0){
            return grid[0][0];
        }
        
        if(m<0 || n<0) return Integer.MAX_VALUE/2;

        if(dp[m][n] != -1)return dp[m][n];
        int up = Helper(grid, m-1, n, dp) + grid[m][n];
        int left = Helper(grid, m, n-1, dp) + grid[m][n];
        return dp[m][n] = Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }
        return Helper(grid, m -1, n - 1, dp);
    }
}