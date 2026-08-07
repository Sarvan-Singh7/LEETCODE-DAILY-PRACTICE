class Solution {
    public static void dfs(int start, int[][] isConnected, boolean isVisited[]){

        isVisited[start] = true;
        ///as Adjacency Matric(not List) so iterate on each from 0 till n;

        for(int i=0; i<isConnected.length; i++){
            if(isVisited[i] == false && isConnected[start][i] == 1){
                dfs(i, isConnected, isVisited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean isVisited[] = new boolean[n];
        //we have to loop through each and every node so 0 to n-1
        for(int i=0; i<n;i++){
            if(isVisited[i] == false){ //as dfs apne sabhi conneted elements ko true mark kar degi so har baar unconnected component se start hoga and hame bhi unconnected components hi chahiye so count++;
                dfs(i, isConnected, isVisited);
                count++;
            }
        }
        return count;
    }
}