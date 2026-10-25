class Solution {
    public static boolean bfs(int grid[][], int i, int j, int m, int n, boolean visited[][]){
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;
        int directions[][] = {{-1,0}, {0,1}, {1,0}, {0, -1}};
        boolean isValid = true;
        while(!q.isEmpty()){
            int arr[] = q.poll();
            int Row = arr[0];
            int Col = arr[1];
            for(int dir[] : directions ){
                int newRow = Row + dir[0];
                int newCol = Col+ dir[1]; 
                if(newRow < 0 || newCol < 0 || newRow >=m || newCol >=n){
                    isValid = false;
                    // return isValid;///yeh nahin kar sakte as agar kiya so kuch cell visited mark hone se bach jayenge
                }
                else if(visited[newRow][newCol] == false && grid[newRow][newCol] == 0){/// el = 1 wali condition no need 
                    q.add(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }
        return isValid;
    }
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        int countIsland = 0;
        ////step1 =Iterate on full 2d Array and pass to bfs fn if there is 0 means land and not visited cell
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                if(grid[i][j] == 0 && visited[i][j] == false){
                    
                    if(bfs(grid, i, j, m, n, visited) == true){
                        countIsland++;
                    }
                }
            }
        }
        return countIsland;
    }
}