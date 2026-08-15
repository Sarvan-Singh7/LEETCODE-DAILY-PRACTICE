class Solution {
    public static boolean dfs(int start, int visited[], int pathVisited[],int check[], int graph[][]){
        visited[start] = 1;
        pathVisited[start] = 1;
        check[start] = 0;
        for(int el : graph[start]){
            if(visited[el] ==0){
                if(dfs(el, visited, pathVisited,check,  graph)){
                    return true;
                }
            }
            else if(pathVisited[el] == 1){
                return true;
            }
        }
        check[start] = 1;
        pathVisited[start] =0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> answer = new ArrayList<>();
        int n =graph.length;
        int visited[] = new int[n];
        int pathVisited[] = new int[n];
        int check[] = new int[n];
        for(int i=0; i<n;i++){
            if(visited[i] == 0){
                dfs(i, visited, pathVisited, check, graph);
            }
        }
        ///as check array mein woh wale marked ho chuke hai jo ki form no cycle so now add to arraylist
        for(int i=0;i<n;i++){
            if(check[i] == 1){
                answer.add(i);
            }
        }
        return answer;
    }
}