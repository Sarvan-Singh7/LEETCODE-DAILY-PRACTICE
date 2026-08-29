class Solution {
    public int countPaths(int n, int[][] roads) {
        ///making a adjacency list
        int modulo = 1000000007;       
        ArrayList<ArrayList<long[]>> adj = new ArrayList<>();
        for(int i=0; i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0; i<roads.length;i++){
            int u = roads[i][0];
            int v = roads[i][1];
            int wt = roads[i][2];
            adj.get(u).add(new long[]{v, wt});
            adj.get(v).add(new long[]{u, wt});
        }
        //making a set up for Dijkastra Algorithm  like dist arrray and all
        long dist[] = new long[n];
        long ways[] = new long[n];
        for(int i=0; i<n;i++){
            dist[i] = (long)1e15;
        }
        PriorityQueue<long[]> q = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));
        q.add(new long[]{0,0});///distance, source node

        dist[0] = 0;
        ways[0] = 1;//as src se end tak ka ek way toh hoga hu
        while(!q.isEmpty()){
           long current[] = q.poll();
           long distance = current[0];
           int node = (int)current[1];
            if(distance > dist[node])continue;////optimization
            for(long neighbour[] : adj.get(node)){
               int adjNode = (int)neighbour[0];
               long wt = neighbour[1];
                if(dist[adjNode] > dist[node] + wt){
                    dist[adjNode] = (dist[node] + wt) ;
                    ways[adjNode] = ways[node] %modulo;////as woh hi same ways age lekar ja raha hai
                    q.add(new long[]{dist[adjNode], adjNode});
                }
                else if(dist[adjNode] == dist[node] + wt){//agar equal hai so ways plus hongi
                    ways[adjNode] = (ways[node] + ways[adjNode]) %modulo;
                    
                }
            }
        }
        return (int)ways[n-1]%modulo;
    }
}