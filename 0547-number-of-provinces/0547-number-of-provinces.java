// class Solution {///THIS IS A CODE USING DFS IN MATRIX
//     public static void dfs(int start, int[][] isConnected, boolean isVisited[]){

//         isVisited[start] = true;
//         ///as Adjacency Matric(not List) so iterate on each from 0 till n;

//         for(int i=0; i<isConnected.length; i++){
//             if(isVisited[i] == false && isConnected[start][i] == 1){//accesing array so all 0 based indexing
//                 dfs(i, isConnected, isVisited);
//             }
//         }
//     }
//     public int findCircleNum(int[][] isConnected) {
//         int count = 0;
//         int n = isConnected.length;
//         boolean isVisited[] = new boolean[n]; //0 based indexing
//         //we have to loop through each and every node so 0 to n-1
//         for(int i=0; i<n;i++){
//             if(isVisited[i] == false){ //as dfs apne sabhi conneted elements ko true mark kar degi so har baar unconnected component se start hoga and hame bhi unconnected components hi chahiye so count++;
//                 dfs(i, isConnected, isVisited);
//                 count++;
//             }
//         }
//         return count;
//     }
// }



////THIS BELOW CODE IS USING DSU(Disjoint Set Union)  so see care fully
//as we know that if we get nodes whose parent is themselves so it means they are ultimate parent so after dsu will return ultimate parents

class Solution {
    
    static int findParent(int[]parent, int i){
        if(parent[i] == i)return i;
        return parent[i] = findParent(parent, parent[i]);
    }
    
    static void union(int u, int v, int parent[], int rank[]){
        int rootI = findParent(parent, u);
        int rootJ = findParent(parent, v);
        if(rank[rootI] < rank[rootJ]){
            parent[rootI] = rootJ;
        }
        else if(rank[rootI] > rank[rootJ]){
            parent[rootJ] = rootI;
        }
        else{    ///agar equal so also increase rank
            parent[rootJ] = rootI;
            rank[rootI]++;

        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        int parent[] = new int[n];//to hadle 0 based indexing
        int rank[] = new int[n];
        ///loop on every index as index represents u,v means u connected to v then it is marked as 1
        for(int i=0; i<n;i++)parent[i] =i;///filling parent ka parent as itself;
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                if(isConnected[i][j] == 1){
                    union(i, j, parent, rank);
                }
            }
        }
        ///now calculate ultimate parent means they are themselves parent
        int provinces =0;
        for(int i=0;i<n;i++){
            if(parent[i] == i){
                provinces++;
            }
        }
        return provinces;
        
    }
}