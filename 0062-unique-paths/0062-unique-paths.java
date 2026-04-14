// class Solution {
//     public int uniquePaths(int m, int n) {      going upper to down
//         int answer = check(0,0,m,n);
//         return answer;
//     }
//     public int check(int sr, int sc, int m, int n){
//         if(sr>m || sc>n){return 0;}
//         if(sr==m-1 && sc == n-1){return 1;}
//         int right = check(sr,sc+1,m,n);   // repetitive calls so that TLE
//         int down = check(sr+1, sc, m,n);

//         return right + down;
//     }
// }

// class Solution {     //NO HELPER FUNCTION AS GOING FROM DOWN TO UP.
//     public int uniquePaths(int m, int n) {
//         if(m==1 || n==1) return 1;    //if use && so TLE
//         return uniquePaths(m-1,n) + uniquePaths(m, n-1);
//     }
// }
    

    ////SLVING THIS PARTICULAR sOLUTION WITH MEMOIZATION
    class Solution {     
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    arr[i][j] = 1;
                }
                else{  //means we are not at row zero or column one
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        return arr[m-1][n-1];    
}
    }