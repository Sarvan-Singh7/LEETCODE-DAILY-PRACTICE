// class Solution {
//     public static boolean dfs(int start, int visited[], int pathVisited[],int check[], int graph[][]){
//         visited[start] = 1;
//         pathVisited[start] = 1;
//         check[start] = 0;     ///check here to be 0
//         for(int el : graph[start]){
//             if(visited[el] ==0){  //yahan visited array
//                 if(dfs(el, visited, pathVisited,check,  graph)){
//                     return true;
//                 }
//             }
//             else if(pathVisited[el] == 1){ //yahan path visited compare as visited true toh hi toh yahan aya
//                 return true;
//             }
//         }
//         check[start] = 1;      //////check as 1 because no cycle as agar cycle hota toh upar hi return ho jata
//         pathVisited[start] =0;
//         return false;
//     }
//     public List<Integer> eventualSafeNodes(int[][] graph) {
//         List<Integer> answer = new ArrayList<>();
//         int n =graph.length;
//         int visited[] = new int[n];
//         int pathVisited[] = new int[n];
//         int check[] = new int[n];
//         for(int i=0; i<n;i++){
//             if(visited[i] == 0){
//                 dfs(i, visited, pathVisited, check, graph);
//             }
//         }
//         ///as check array mein woh wale marked ho chuke hai jo ki form no cycle so now add to arraylist
//         for(int i=0;i<n;i++){
//             if(check[i] == 1){
//                 answer.add(i);
//             }
//         }
//         return answer;
//     }
// }




////////////DOING VIA BFS METHOD AS WE USED IN TOPO SORT BUT WE NEED TO REVERSE EDGES AS BECAUSE HUM OUTDEGREE KI JAGAH INDEGREE SE KAAM KAR SAKEIN , AS AGAR OUTDEGREE SE KARENGE SO TC = O(V.E) AND WITH INDEGREE TC = O(V+E);





class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> answer = new ArrayList<>();
        int n =graph.length;

        //step1 == reverse edges so that outDegree ki jagah inDegree kaam kar jaye;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();//int this we are storing reversed edges graph
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        int inDegree[] = new int[n];
        for(int i=0;i<n;i++){
            for(int el : graph[i]){
                int u = el;
                int v = i;
                adj.get(u).add(v);
                inDegree[i]++;
            }
        }
        ///now toposort on it
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n;i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        boolean isSafe[] = new boolean[n];///to track which node is safe ansd which not
        while(!q.isEmpty()){
            int current = q.poll();
            isSafe[current] = true;///as safe hai tab hi quwue main hai
            for(int neighbour : adj.get(current)){
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
        for(int i=0; i<n;i++){
            if(isSafe[i] == true){
                answer.add(i);
            }
        }
        return answer;
    }
}