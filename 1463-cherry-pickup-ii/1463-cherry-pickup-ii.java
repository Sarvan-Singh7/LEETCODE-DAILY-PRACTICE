class Solution {
    public static int Helper(int[][] grid, int currRowAB, int colA, int colB, int dp[][][]){
        if(colA < 0 || colA >= grid[0].length || colB <0 || colB >= grid[0].length){  //out of Bound case for both
            return -1000000;
        }
        if(currRowAB == grid.length -1){
            if(colA == colB)return grid[currRowAB][colA];   ///as Agar dono same Grid pe aye so consider only one
            else return grid[currRowAB][colA] + grid[currRowAB][colB];
        }
        if(dp[currRowAB][colA][colB]  != -1000000)return dp[currRowAB][colA][colB]; 
        ///loop on column to give it all directions   column of Robot1 and Column of Robot2
        int maxi =0;
        for(int c1 =-1; c1 <= +1; c1++){
            for( int c2 = -1; c2 <= +1; c2++){
                if(colA == colB){
                     maxi = Math.max(maxi,grid[currRowAB][colA] + Helper(grid, currRowAB+1, c1+ colA, c2 + colB, dp) );
                }
                else{
                    maxi = Math.max(maxi, grid[currRowAB][colA] + grid[currRowAB][colB] + Helper(grid, currRowAB+1, c1 + colA, c2 + colB, dp));
                }
            }
        }
        return dp[currRowAB][colA][colB] = maxi;

    }
    
    public int cherryPickup(int[][] grid) {
        int m= grid.length;
        int n = grid[0].length;
        int dp[][][] = new int[m][n][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j], -1000000);
            }
        }
        //robotA starting column is 0 and Robot B starting Column is n-1;
        return Helper(grid, 0, 0, n-1, dp);  ////
    }
}