class Solution {
    static int parent[];
    static int size[];
    public static int findParent(int i){
        if(i == parent[i])return i;
        return parent[i] = findParent(parent[i]);
    }
    public static void union(int u ,int v){///union by size
        int rootI = findParent(u);
        int rootJ = findParent(v);
        if(rootI != rootJ){
            parent[rootI] = rootJ;
            size[rootJ] += size[rootI];///size added
        }
    }
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        parent = new int[n*n];
        size = new int[n * n];
        for(int i=0; i<n *n;i++){
           parent[i] = i; 
           size[i] =1;///////do not forgot again to set it to 1
        }
        //step1 = it is to make dsu componenets with a parent so to acces it easily
        int directions[][] = {{-1,0}, {0,1}, {1,0}, {0,-1}};
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                int pos = i *n +j;
                if(grid[i][j] == 1){////as island so form its dsu
                    for(int dir[]: directions){
                        int row = i + dir[0];
                        int col = j + dir[1];
                        int nPos = row * n + col;
                        if(row <n && row >=0 && col >=0 && col <n && grid[row][col] == 1){
                            if(findParent(pos) != findParent(nPos)){
                                union(pos, nPos);
                            }
                            

                        }
                    }
                }
            }
        }
        int maxi =0;
        boolean hasZero = false;
        //step2 = now we will calculate maximum component on changinh any 0 to 1 one time
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                if(grid[i][j] == 0){
                    hasZero = true;
                    HashSet<Integer> set = new HashSet<>();
                    for(int dir[] : directions){
                        int row = dir[0] + i;
                        int col = dir[1] + j;
                        if(row >=0 && row <n && col >=0 && col <n && grid[row][col]== 1){//neighbour should be 1
                            int parent = findParent(row * n + col);
                            set.add(parent);
                        }
                    }
                    //maxi
                    int current = 1;///as 1 bhi add hoga as changed from 0 to 1
                    for(int el : set){
                        current += size[el];//as parent hai el so parent ka size means all connected components to it

                    }
                    maxi = Math.max(current, maxi);
                }
            }
        }
        if(hasZero == false)return n*n;
        return maxi;
    }
}