class Solution {
    public static boolean dfs(int start, int visited[],int pathVisited[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        visited[start] = 1;
        pathVisited[start] =1;
        for(int el : adj.get(start)){
            if(visited[el] == 0){
                if(dfs(el, visited, pathVisited, adj, st))return true; //yahan true return karna hota hai as cycle detected in else if case
            }
            else if(visited[el] == 1 && pathVisited[el] == 1){
                return true;
            }
        }
        pathVisited[start] =0;
        st.push(start);//add at last
        return false;
    }
    public int[] findOrder(int V, int[][] edges) {
       ///COurse Schedule 1 done with BFS so this with DFS but ordering of u and v different as see v mein u dala gaya
       
       ///convert to Adjacency list
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i=0; i<V;i++){
        adj.add(new ArrayList<>());
       }
       for(int i=0;i<edges.length;i++){
          int u = edges[i][0];
          int v = edges[i][1];
          adj.get(v).add(u);//yahan par v mein u dala gaya hai as opposite given
       }
       Stack<Integer> st = new Stack<>();
       int visited[] = new int[V];
       int pathVisited[] = new int[V];
       for(int i=0; i<V;i++){
            if(visited[i] == 0){
                //agar cycle hua toh woh dfs function true return karega so then return empty array so check below
               if(dfs(i, visited,pathVisited,  adj, st) == true){
                return new int[0];
               }; //and simple false pe toh har baar call ho hi raha hai
            } 
            
       }
       ////add all stack items to the ArrayList to return
       int answer[] = new int[V];
       int i=0;
       while(!st.isEmpty()){
           answer[i++] = st.pop();
       }
       return answer;
    }
}