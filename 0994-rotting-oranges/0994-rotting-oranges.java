class Solution {
    public int orangesRotting(int[][] grid) {
        int freshCount = 0;  //Count all Fresh means 1 el wale as hum inhein queue wale case main hatate rahenge 2 banakar and agar last tak 0 freshCount hua so sab 1 ko hamne 2 bana diya
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                }
                if(grid[i][j] == 1){
                    freshCount++;
                }
            }
        }
        int seconds =0;   //to calculate seconds
        int directions[][] = {{-1,0}, {0,1}, {1, 0}, {0, -1}};
//humne sabhi starting wale 2 count kar liye hai and we know all 2 will do all direction work simultaneous;

        while(!q.isEmpty() && freshCount >0){   //freshCount wali condition ke bina nahin chalega
            int size = q.size();//as jitne bhi 2 hai sabko hi apne neighbours pe kaam karna hai

            for(int i=1; i<= size; i++){
                int current[] = q.poll();
                int newRow = current[0];
                int newCol = current[1];

                //har ek 2 wala nikal and uske neighbours visit kiye
                for(int dir[] : directions){
                    int dirRow = newRow + dir[0];
                    int dirCol = newCol + dir[1];
                    //4 bar loop chalegi and sare neighbours ka kaam kar degi agar 1 hue so 2 kar degi
                    if(dirRow >=0 && dirRow <m && dirCol >= 0 && dirCol <n && grid[dirRow][dirCol] == 1){//agar 1 hai so work
                            grid[dirRow][dirCol] = 2;
                            freshCount--;///as 1 se 2 bana diya so count decrease
                            q.add(new int[]{dirRow, dirCol});//q mein daal do as ab woh 2 ho chuka hai
                    }
                }
            }
            seconds++;///as har baar 

        }
        return (freshCount == 0)?seconds:-1; //as agar sare oranges 1 se 2 nahin bane so -1 return

    }
}