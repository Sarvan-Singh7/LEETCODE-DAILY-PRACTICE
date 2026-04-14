// class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int n=obstacleGrid.length;
//         int answer = countPaths(obstacleGrid,0,0,n,obstacleGrid[0].length);
//         return answer;
//     }
//     static int countPaths(int[][] maze, int i, int j, int n,int m) {

//         // ❌ Out of bounds
//         if (i >= n || j >= m)
//             return 0;

//         // ❌ Blocked cell
//         if (maze[i][j] == 1)
//             return 0;

//         // ✅ Destination reached
//         if (i == n - 1 && j == m - 1)
//             return 1;

//         // ➡ Move Right + ⬇ Move Down
//         return countPaths(maze, i, j + 1, n,m)
//              + countPaths(maze, i + 1, j, n,m);
//     }
// }

////DOING IT WITH MEMOIZATION IN DP

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int [m][n];
        if(obstacleGrid[0][0] == 1)return 0;//because if first element or starting point blocked so cannot reach

        dp[0][0] = 1;//make first element to 1 for further calculations as one way to reach to first element

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j] == 1)dp[i][j] = 0;///if obstacle so no way to reach there
                else{///no obstacle so apply formula
                    if(i>0){                  //yahan par conditions isliye lagayi because yahan par hamne first row and first column ke liye alag condition nahin likhi thi
                        dp[i][j] += dp[i-1][j];
                    }
                    if(j>0){
                        dp[i][j] += dp[i][j-1];  ///WE DID += PLEASE REMEMBER IT
                    }
                }
            }
        }

        return dp[m-1][n-1];
    }
    
}


    


