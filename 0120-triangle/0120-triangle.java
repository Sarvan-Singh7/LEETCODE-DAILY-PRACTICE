// class Solution {   = Memoization code + Recursion O(nSquare) TC and Sc
//     public int Helper(List<List<Integer>> triangle, int endRow, int row, int col, int dp[][]){
//         if(dp[row][col] !=Integer.MAX_VALUE)return dp[row][col];
//         if(row == endRow -1)return triangle.get(row).get(col);  //when reached last row
//         //In this no need of out of bounds Base Case as not needed
        
//         int down = triangle.get(row).get(col) + Helper(triangle, endRow, row+1, col,dp);
//         int diagonal = triangle.get(row).get(col) + Helper(triangle, endRow, row+1, col+1, dp);
//         return dp[row][col] =Math.min(down, diagonal) ;

//     }
//     public int minimumTotal(List<List<Integer>> triangle) {

//         int n = triangle.size();
//         int dp[][] = new int[n][n];
//         for(int i=0;i<n;i++){
//             Arrays.fill(dp[i], Integer.MAX_VALUE);
//         }
       
//         return Helper(triangle,n, 0 ,0, dp);
//     }
// }

class Solution {    ///Tabulation code in O(N square) TC and SC
    
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int dp[][] = new int[n][n];
        for(int j=0;j<n;j++){    ////as base case covered of Recursion that ends on n-1 row
            dp[n-1][j] = triangle.get(n-1).get(j);
        }
        ////in this Tabulation format we will iterate reverse starting fro n-2 as  because we also did start from 0, 0 in recursion code so taken opposite
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down = triangle.get(i).get(j) + dp[i+1][j];
                int diagonal = triangle.get(i).get(j) + dp[i+1][j+1];
                dp[i][j] = Math.min(down, diagonal);
            }
        }
        return dp[0][0];
    }
}