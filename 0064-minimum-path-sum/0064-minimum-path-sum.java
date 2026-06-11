// class Solution {   //// RECURSION + MEMOIZATION CODE
 //           TC = O(M*N)
 //             SC =  O(M*N) + O(pATH lENGTH OF (M-1)+(N-1))
//     public static int Helper(int[][] grid, int m, int n, int dp[][]){
//         if(m==0 && n==0){
//             return grid[0][0];
//         }
        
//         if(m<0 || n<0) return Integer.MAX_VALUE/2;   ///divide by 2 so that not integer overflow if not another value taken

//         if(dp[m][n] != -1)return dp[m][n];
//         int up = Helper(grid, m-1, n, dp) + grid[m][n];
//         int left = Helper(grid, m, n-1, dp) + grid[m][n];
//         return dp[m][n] = Math.min(up, left);
//     }
//     public int minPathSum(int[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;
//         int dp[][] = new int[m][n];
//         for(int i=0;i<m;i++){
//             Arrays.fill(dp[i], -1);
//         }
//         return Helper(grid, m -1, n - 1, dp);
//     }
// }






class Solution {
    
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)dp[i][j] = grid[0][0];
                else{
                    int up=Integer.MAX_VALUE, left=Integer.MAX_VALUE;
                    if(i>0)up = grid[i][j] + dp[i-1][j];
                    if(j>0)left = grid[i][j] + dp[i][j-1];
                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[m-1][n-1];
    }
}