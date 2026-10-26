class Solution {
    
    public static long bfs(int grid[][], int m, int n, int i, int j, boolean visited[][]){
        visited[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        long sum =grid[i][j];
        int directions[][] = {{-1,0}, {0,1}, {1,0}, {0, -1}};
        while(!q.isEmpty()){
            int temp[] = q.poll();
            int row = temp[0];
            int col = temp[1];
            for(int dir[] : directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow <0 || newCol <0 || newCol >=n || newRow >=m){
                    continue;
                }
                else if(grid[newRow][newCol] != 0 && visited[newRow][newCol] == false){
                    sum += grid[newRow][newCol];
                    q.add(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int countIsland =0;
        boolean visited[][] = new boolean[m][n];

        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] !=0 && visited[i][j] == false){
                    long sumEl = bfs(grid, m, n, i, j, visited);
                    System.out.println(sumEl);
                    if(sumEl %k == 0 ){
                        countIsland++;
                    }
                }
        }
        }
        return countIsland;
        
    }
}