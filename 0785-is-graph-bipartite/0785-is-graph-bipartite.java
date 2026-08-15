// class Solution {    //////////BFS APPROACH----------------------------------------
//     public static boolean bfs(int start, int[][] graph, int[] color){
//         Queue<Integer> q = new LinkedList<>();
//         int n = graph.length;

//         q.add(start);
//         color[start] = 0;

//         while(!q.isEmpty()){
//             int current = q.poll();
//             ///neighbours
//             for(int neighbour: graph[current]){
//                 if(color[neighbour] == -1){
//                     q.add(neighbour);
//                     color[neighbour] = 1 - color[current];
//                 }
//                 else if(color[neighbour] == color[current]){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public boolean isBipartite(int[][] graph) {
        
//         int n = graph.length;        
//         int color[] = new int[n];///to mark with 1 and 0;
//         Arrays.fill(color, -1);

//         for(int i=0; i<n;i++){   //as graph may contains disconnected components
//             if(color[i] == -1){
//                 if(bfs(i, graph, color) == false){
//                     return false;
//                 }
//             }
//         }
//         return true;

//     }
// }



//////////////////////////////DFS APPROACH------------------------------------------------------------





class Solution {
    public static boolean dfs(int start, int[][] graph, int[] color, int initialColor){
        color[start] = initialColor;
        for(int neighbour : graph[start]){//iterating the neighbour
            if(color[neighbour] == -1){
                if(dfs(neighbour, graph, color, 1- initialColor)== false )return false;
            }
            else if(color[neighbour] == color[start]){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;        
        int color[] = new int[n];///to mark with 1 and 0;
        Arrays.fill(color, -1);

        for(int i=0; i<n;i++){   //as graph may contains disconnected components
            if(color[i] == -1){
                if(dfs(i, graph, color, 0) == false){
                    return false;
                }
            }
        }
        return true;

    }
}