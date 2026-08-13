class Solution {
    public int numEnclaves(int[][] grid) {
        ///same as Leetcode 130 so we will do it in the BFS so that that previous gotpracticed
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        ///we will insert all boundry 1 in Queue and mark them as 2 so to access its neighbour and make them 'T' if possible
        //do for boundry COlumns
        for(int i=0; i<m;i++){
           // first column
            if(grid[i][0] == 1){
                q.add(new int[]{i,0});
                grid[i][0] = 2;
            }
            //last column
            if(grid[i][n-1] == 1){
                q.add(new int[]{i,n-1});
                grid[i][n-1] = 2;
            }
        }

        for(int i=0; i<n;i++){
            //first row
            if(grid[0][i] == 1){
                q.add(new int[]{0,i});
                grid[0][i] = 2;
            }
            //last row
            if(grid[m-1][i] == 1){
                q.add(new int[]{m-1,i});
                grid[m-1][i] = 2;
            }
        }
        int directions[][] = {{-1,0}, {0,1}, {1,0}, {0,-1}};

        
        while(!q.isEmpty()){
            int current[] = q.poll();
            int row = current[0];
            int col = current[1];
            for(int dir[] : directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                //boundry check
                if(newRow >=0 && newRow <m && newCol >=0 && newCol <n && grid[newRow][newCol] == 1){
                    q.add(new int[]{newRow, newCol});
                    grid[newRow][newCol] = 2;
                }
            }
        }
        int count =0;
        //calculate remaining 1 as boundry se connected walon ko 2 kar diya
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                if(grid[i][j]== 1){
                    count++;
                }
            }
        }
        return count;


    }
}