// class Solution {   /////Recursion + Memoization code top - down approach in Linear Tc
//     public static int Helper(int[][] arr, int m, int n, int dp[][]){ //will move up and left as we are starting from last element sp gp different
//         if(m==0 && n==0){
//             return 1;
//         }
//         if(m<0 || n<0)return 0;
//         if(arr[m][n] == 1)return 0;
//         if(dp[m][n] != -1)return dp[m][n];
//         int up = Helper(arr, m-1, n, dp);
//         int left = Helper(arr, m, n-1, dp);
//         return dp[m][n] = up + left;
//     }
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
//         for(int i=0;i<dp.length;i++){
//             Arrays.fill(dp[i], -1);
//         }
//         if(obstacleGrid[0][0] == 1)return 0;
//         return Helper(obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1, dp);  //see as we pass m-1 and n-1 (not m,n as see what needed)
//     }
    
// }


class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(obstacleGrid[i][j] == 1)dp[i][j] = 0;
                else if((i ==0 && j==0)){
                    dp[i][j] = 1;
                }
                else{
                    int up=0,left=0;
                    if(i>0)up = dp[i-1][j]; ////yahan par mai dp array ki jagah obstacle wala array le raha tha that was my mistake
                    if(j>0)left = dp[i][j - 1];
                    dp[i][j]  = up + left;
                }
            }
        }
        return dp[m-1][n-1]; 
    }
    
}



// ////DOING IT WITH MEMOIZATION IN DP

// class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int m = obstacleGrid.length;
//         int n = obstacleGrid[0].length;
//         int dp[][] = new int [m][n];
//         if(obstacleGrid[0][0] == 1)return 0;//because if first element or starting point blocked so cannot reach

//         dp[0][0] = 1;//make first element to 1 for further calculations as one way to reach to first element

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(obstacleGrid[i][j] == 1)dp[i][j] = 0;///if obstacle so no way to reach there
//                 else{///no obstacle so apply formula
//                     if(i>0){                  //yahan par conditions isliye lagayi because yahan par hamne first row and first column ke liye alag condition nahin likhi thi
//                         dp[i][j] += dp[i-1][j];
//                     }
//                     if(j>0){
//                         dp[i][j] += dp[i][j-1];  ///WE DID += PLEASE REMEMBER IT
//                     }
//                 }
//             }
//         }

//         return dp[m-1][n-1];
//     }
    
// }


    


