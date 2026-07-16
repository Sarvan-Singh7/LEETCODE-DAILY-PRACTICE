class Solution {
    public int countSquares(int[][] matrix) {
        int answer =0;
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        ///first please fill first row and column with same value;
        for(int j=0; j<n;j++)dp[0][j] = matrix[0][j]; //first row as it is
        for(int i=0;i<m;i++)dp[i][0] = matrix[i][0];  //first col as it is

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j] == 0){ //if 0 is current el so cannot form square
                    dp[i][j] = 0;
                }
                else{
                    int all = Math.min(dp[i-1][j] ,Math.min(dp[i-1][j-1] , dp[i][j-1]) ) ;///sab ka minimum +1 will be in new element
                    dp[i][j] = all +1;
                }
            }
        }
        ///now calculate sum of all elements of dp matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                answer += dp[i][j];
            }
        }

        return answer;
    }
}