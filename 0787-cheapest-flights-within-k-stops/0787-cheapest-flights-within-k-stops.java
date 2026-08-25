class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if(n==0)return 0;
        int m = flights[0].length;
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int i=0 ; i<flights.length;i++){
            int u = flights[i][0];
            int v = flights[i][1];
            int wt = flights[i][2];
            adj.get(u).add(new int[]{v, wt});///as directed graph;
        }

        Queue<int[]> q = new LinkedList<>();
        int dist[] = new int[n];
        Arrays.fill(dist, (int)1e9);
        q.add(new int[]{0, src, 0});///stops, src, distance;
        dist[src] =0;
        while(!q.isEmpty()){
            int current[] = q.poll();
            int stops = current[0];
            int node = current[1];
            int distance = current[2];
            
            if(stops >k)continue;
            for(int el[]: adj.get(node)){
                int adjNode = el[0];
                int wt = el[1];
                if(dist[adjNode]  > wt + distance && stops <=k){
                    dist[adjNode] = wt+distance;
                    q.add(new int[]{stops+1, adjNode, distance + wt});
                }
            }
        }
        return (dist[dst] == (int)1e9)?-1:dist[dst];
    }
}