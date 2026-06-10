

// class Solution {     //NO HELPER FUNCTION AS GOING FROM DOWN TO UP.
//     public int uniquePaths(int m, int n) {
//         if(m==1 || n==1) return 1;    //if use && so TLE
//         return uniquePaths(m-1,n) + uniquePaths(m, n-1);
//     }
// }
    


//     class Solution {     
//     public int uniquePaths(int m, int n) {
//         int arr[][] = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0 || j==0){
//                     arr[i][j] = 1;
//                 }
//                 else{  //means we are not at row zero or column one
//                     arr[i][j] = arr[i-1][j] + arr[i][j-1];
//                 }
//             }
//         }
//         return arr[m-1][n-1];    
// }
//     }


// class Solution {    ///Memoization Code along side Recursion (top Down)
//     public int Helper(int m, int n, int row, int col, int dp[][]){
//         if(row == m-1 && col == n-1)return 1;//one path exists as reached to last
//         if(row >= m || col >= n) return 0;
//         if(dp[row][col] != -1)return dp[row][col];
//         int down = Helper(m, n, row+1, col, dp);
//         int right = Helper(m, n, row, col+1, dp);
//         return dp[row][col] = down + right;
//     }
//     public int uniquePaths(int m, int n) {
//         int dp[][] = new int[m][n];
//         for(int i=0;i<m;i++){
//             Arrays.fill(dp[i], -1);
//         }
//         return Helper(m, n, 0, 0, dp);
          
//     } 
// }

class Solution {    ///Tabulation Code (Bottom Up Approach from Base Case) 
    public int uniquePaths(int m, int n) {
          int arr[][] = new int[m][n];  //as see copy wala code that base case is on 0,0 so make it one ans other to be calculated as up and left

          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i ==0 && j ==0)arr[i][j] = 1;
                else{
                    int up=0, left=0;
                    if(i>0)up = arr[i-1][j];
                    if(j >0)left = arr[i][j-1];
                    arr[i][j] = up + left;
                }
            }
            
          } 
          return arr[m-1][n-1];
}
    }