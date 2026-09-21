class Solution {
    static int timer = 1;
    public static void dfs(int node, int parent, int visited[], int tin[], int low[], ArrayList<ArrayList<Integer>> adj, List<List<Integer>> bridge){
        visited[node] = 1;
        low[node] = tin[node] = timer;
        timer++;
        for(int it : adj.get(node)){
            if(it == parent)continue; ///continue if it is a parent
            if(visited[it] == 0){   //if not visited yet
                dfs(it, node, visited, tin, low, adj, bridge);
                low[node] = Math.min(low[node], low[it]);

                if(low[it] > tin[node]){
                    bridge.add(Arrays.asList(it, node));
                }
            }
            else{  //if already visited
                low[node] = Math.min(low[node], low[it]);
            }
        }

    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n;i++){
            adj.add(new ArrayList<>());
        }
    
        for(int i=0; i< connections.size();i++){
            int u = connections.get(i).get(0), v = connections.get(i).get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        List<List<Integer>> bridge = new ArrayList<>();
        int visited[] = new int[n];
        int tin[] = new int[n];
        int low[] = new int[n];

        dfs(0, -1, visited, tin, low, adj, bridge);

        return bridge;
    }
}