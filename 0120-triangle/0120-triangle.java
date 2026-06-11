class Solution {
    public int Helper(List<List<Integer>> triangle, int endRow, int row, int col, int dp[][]){
        if(dp[row][col] !=Integer.MAX_VALUE)return dp[row][col];
        if(row == endRow -1)return triangle.get(row).get(col);  //when reached last row
        //In this no need of out of bounds Base Case as not needed
        
        int down = triangle.get(row).get(col) + Helper(triangle, endRow, row+1, col,dp);
        int diagonal = triangle.get(row).get(col) + Helper(triangle, endRow, row+1, col+1, dp);
        return dp[row][col] =Math.min(down, diagonal) ;

    }
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        // List<List<Integer>> dp = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     List<Integer> inner = new ArrayList<>();
        //     for(int j=0;j<i+1;j++){
        //         inner.add(Integer.MAX_VALUE);
        //     }
        //     dp.add(inner);
        // }
        return Helper(triangle,n, 0 ,0, dp);
    }
}