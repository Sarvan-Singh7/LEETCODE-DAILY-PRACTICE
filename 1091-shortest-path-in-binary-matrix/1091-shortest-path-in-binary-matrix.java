class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        q.add(new int[]{0,0,1});//row,col,distance =1

        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        }
        int direction[][] = {{-1,0}, {0,1},{1,0}, {0,-1}, {-1,1}, {1,1}, {1,-1},{-1,-1}};
        
        while(!q.isEmpty()){
            int current[] = q.poll();
            int r =current[0];
            int c = current[1];
            int dist = current[2];

            if(r==n-1 && c == n-1)return dist ;

            for(int dir[]: direction){//har ek direction mein jao and work karo

                int nr = r + dir[0];
                int nc = c + dir[1];
                if(nr >=0 && nr <n && nc >=0 && nc <n && grid[nr][nc] == 0){
                    grid[nr][nc] = 1;//markrd it 1 so not visit again
                    q.add(new int[]{nr, nc, dist+1});
                }
            }
        }
        return -1;
    }
}