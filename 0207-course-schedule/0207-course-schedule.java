class Solution {//changing below parameter variables from numCourser => V
                //and prerequisites[][] => edges
    public boolean canFinish(int V, int[][] edges) {
        //step1 = convert edges to adjacency list =/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){//jitne nodes utne hi rows
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){//not till V as we iterate in edges
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);//not vica versa as directed hai
        }

        //step2 = making inDegree array and storing all 0 in array to queue/=/=/=/=/=/=/=/
        int inDegree[] = new int[V];
        for(int i =0; i<V;i++){   ///sare in degree dall do array mein
            for(int el : adj.get(i)){
                inDegree[el]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        ///insert all 0 inDegree to Queue
        for(int i=0;i<V;i++){
            if(inDegree[i] == 0)q.add(i);
        }
        //step3 => working in loop on queue on all 0 inDegree as when one 0 inDegree element connected to adjacent neighbours so it reduces their inDegree by 1 when removed
        int count =0;
        while(!q.isEmpty()){
            int current = q.poll();
            count++;
            for(int el : adj.get(current)){
                inDegree[el]--;
                if(inDegree[el] == 0)q.add(el);
            }
        }
        //as count ne dekha ki kitne nodes are not in cycle as if not cycle so all are present in count
        if(count == V )return true;

        return false;
    }
}