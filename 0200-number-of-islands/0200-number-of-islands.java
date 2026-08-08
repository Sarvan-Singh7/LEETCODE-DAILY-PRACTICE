class Solution { ///AGAR IS Q MEIN DIAGONAL BHI CHECK KARNA HOTA SO ALL DIRECTION KI DFS CHALTI AS SEE 4 KI CHALAI HAI ABHI BAS
    public static void dfs(char[][] grid, int row, int col, boolean visited[][]){
        int rowsT = grid.length;
        int colsT = grid[0].length;

        if(row <0 || col <0 || rowsT <= row || colsT <= col)return;
        if(grid[row][col] == '0')return;

        grid[row][col] = '0';                      ///DOING THIS SO NOT ANY VISITED ARRAY NEEDED

        dfs(grid, row -1, col, visited);//up
        dfs(grid, row, col -1, visited);//left
        dfs(grid, row + 1, col, visited);//down
        dfs(grid, row, col + 1, visited);//right
    }
    public int numIslands(char[][] grid) {
        int count =0;
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[m][n];  //NO NEED OF VISITED ARRAY IN THIS EXAMPLE OF DFS AS WE DO MODIFY grid[] ARRAY TO '0' SO NOT TO COVER AGAIN
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                if( grid[i][j] == '1' ){
                    count++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return count;
    }
}