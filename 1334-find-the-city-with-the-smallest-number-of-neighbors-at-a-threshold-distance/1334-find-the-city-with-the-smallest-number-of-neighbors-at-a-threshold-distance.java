class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int dist[][] = new int[n][n];
        for(int i=0; i<n;i++){
            Arrays.fill(dist[i], (int)1e8);///infinitu addded to all
        }
        for(int i=0; i<edges.length;i++){//converting to Adjacency MATRIX
            int u = edges[i][0];
            int v= edges[i][1];
            int wt = edges[i][2];
            dist[u][v] = wt;
            dist[v][u] = wt;///as budirectional graph
        }
        
        for(int i=0; i<n;i++)dist[i][i] =0;//smae index pe toh zeroes hi hai

        //step1 -> storing smaller distances in dist
        for(int way = 0; way <n; way++){
            for(int i=0; i<n;i++){
                for(int j=0; j<n;j++){
                    if(dist[i][way] == (int)1e8 || dist[way][j] == (int)1e8){
                        continue;
                    }
                    int a = dist[i][way] + dist[way][j];
                    dist[i][j] = Math.min(dist[i][j], a);
                }
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }

        ////step2 -> iterate through the dist and make calculation in which each row means distance to all other node by it so we will get distance leass than threshold from that.

        int result =n;
        int node =0;
        for(int i=0; i<n;i++){
            int count =-1;//-1 because to skip diagonal as also they are calculated below
            for(int j=0; j<n;j++){
                if(dist[i][j] <= distanceThreshold){
                    count++;
                }
            }
            if(count <= result){
                node =i;
                result = count;
            }
        }

        return node;
    }
}