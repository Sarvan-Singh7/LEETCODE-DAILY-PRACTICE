class Solution {
    static int parent[];
    static int rank[];

    public static int findParent(int i){
        if(i == parent[i])return i;
        return parent[i] = findParent(parent[i]);
    }
    public static void union(int u, int v){
        int rootI = findParent(u);
        int rootJ = findParent(v);
        if(rootI != rootJ){
        if(rank[rootI] < rank[rootJ]){
            parent[rootI] = rootJ;
        }
        else if(rank[rootI] > rank[rootJ]){
            parent[rootJ] = rootI;
        }
        else{
            parent[rootJ] = rootI;
            rank[rootI]++;
        }
    }}
    public int makeConnected(int n, int[][] connections) {
        //-1 only when edges given here are not sufficient to connect all means edges are not n-1
        if(connections.length  <n-1)return -1;
        ///Here it is Sure that DSU will be used
        parent = new int[n];
        rank = new int[n];
        int count=0;
        int count2=0;
        for(int i=0; i<n;i++)parent[i] = i;
        for(int i=0; i<connections.length;i++){
            int u = connections[i][0];
            int v = connections[i][1];
            //as to not form a mst and we want a tree so need not similar parent
            if(findParent(u) != findParent(v)){
                union(u,v);
                count++;
            }
            else{
                count2++;
            }
        }
        return n- count - 1;
    }
}