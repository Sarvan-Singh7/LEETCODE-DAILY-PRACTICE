class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int dist[][] = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                if(mat[i][j] == 0){ //agar 0 hai toh woh resultant mein bhi 0 hi hoga &&&& we put it into a Queue so that we can also calculate its distance from 1 and then 1 can be marked
                    q.add(new int[]{i, j});
                    dist[i][j] = 0;
                }
                else{
                    dist[i][j] = -1;
                }
            }
        }
        int directions[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        while(!q.isEmpty()){
            int current[] = q.poll();
            int row = current[0];
            int col = current[1];
            for(int dir[]: directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow <m && newRow >=0 && newCol >=0 && newCol <n && dist[newRow][newCol] == -1){
                    dist[newRow][newCol] = 1 + dist[row][col];
                    q.add(new int[]{newRow, newCol});
                }
            }
        }
        return dist;

    }
}