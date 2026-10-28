class Solution {/////////////////////////DO Again
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Integer dp[][][] = new Integer[m][n][1024];
        return f(grid, m-1, n-1, 0, dp);
    }
    public static int f(int grid[][], int m, int n, int currentXOR, Integer dp[][][]){
        if(m==0 && n==0)return currentXOR ^ grid[m][n];
        if(m <0 || n<0)return Integer.MAX_VALUE;

        if(dp[m][n][currentXOR] != null) return dp[m][n][currentXOR];
        int nextXOR = grid[m][n] ^ currentXOR;

        int up = f(grid, m-1, n, nextXOR, dp);
        int left = f(grid, m, n-1, nextXOR, dp);

        return dp[m][n][currentXOR] = Math.min(up, left);
    }
}