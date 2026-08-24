class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0] - b[0]);//important to sort according to distance
        int directions[][] = {{-1,0}, {0,1}, {1,0}, {0,-1}};
        q.add(new int[]{0,0,0});///distance, row, column
        int dist[][] = new int[n][m];
        for(int i=0; i<n;i++)Arrays.fill(dist[i], (int)1e9);
        
        dist[0][0] =0;///mark it as 0 because it is start
        while(!q.isEmpty()){
            int current[] = q.poll();
            int diff = current[0];
            int r = current[1];
            int c = current[2];
            if(r== n-1 && c == m-1)return diff;
            for(int dir[] : directions){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(nr >=0 && nr <n && nc >=0 && nc<m){
                    int newEffort = Math.max(diff, Math.abs(heights[r][c] - heights[nr][nc]));
                    if(newEffort < dist[nr][nc]){
                        dist[nr][nc] = newEffort;
                        q.add(new int[]{newEffort, nr, nc});
                    }
                }
                

            }
        }
        return 0;
    }
}