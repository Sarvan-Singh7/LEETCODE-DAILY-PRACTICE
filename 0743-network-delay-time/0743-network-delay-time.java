class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ////convert to adjacency List ArrayList to Apply Dijkastra
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0; i<=n;i++)adj.add(new ArrayList<>());

        for(int i=0; i<times.length;i++){
            int u = times[i][0];
            int v = times[i][1];
            int wt= times[i][2];
            adj.get(u).add(new int[]{v, wt});
        }
        int dist[] = new int[n+1];///as 1 based indexing
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0] - b[0]);//sort according to Distance
        q.add(new int[]{0, k});///distance, source added 
        //now making dist array all elements to (int)1e9 and source to 0 distance
        Arrays.fill(dist, (int)1e9);
        dist[k] = 0;
        while(!q.isEmpty()){
            int arr[] = q.poll();
            int distance=arr[0];
            int node = arr[1];
            if(distance > dist[node])continue;
            for(int neighbour[] : adj.get(node)){
                int adjNode = neighbour[0];
                int wt = neighbour[1];
                if(dist[adjNode] > distance + wt){
                    dist[adjNode] = distance + wt;
                    q.add(new int[]{dist[adjNode], adjNode});
                }
            }
        }
        int maxTime=0;
        for(int i=1; i<=n;i++){
            if(dist[i] == (int)1e9)return -1;
            maxTime = Math.max(dist[i], maxTime);
        }

        return maxTime;
    }
}