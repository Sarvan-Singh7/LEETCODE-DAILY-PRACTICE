class Solution {
    // public static void dfs(int[][] image, int row, int col, int color, int initialColor){ ///DFS
    //     int n = image.length;
    //     int m = image[0].length;
    //     if(row <0 || row >=n || col < 0 || col >=m)return;
    //     if(image[row][col] != initialColor)return; //as jo rang sabse pehle tha ushi ke sare same rang walon ko color dena hai, bakiyon ko nahin
    //     image[row][col] = color;  //agar color ke barabar nahin hai so nahin karna

    //     dfs(image, row -1, col, color , initialColor);//up
    //     dfs(image, row, col -1, color , initialColor);//left
    //     dfs(image, row + 1, col, color , initialColor);//down
    //     dfs(image, row, col + 1, color , initialColor);//right
    // }
    
    public static void dfs(int[][] image, int row, int col, int color, int initialColor){ ///DFS
        int n = image.length;
        int m = image[0].length;
        int directions[][] = {{-1, 0}, {0, 1}, {1,0}, {0,-1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col});
        image[row][col] = color; //mendate
        while(!q.isEmpty()){
            int current[] = q.poll();
            int currRow = current[0];
            int currCol = current[1];
            //now move in all 4 adjacent direction for current one and get converted if equal to initialColor
            for(int dir[] : directions){
                int newRow = dir[0] + currRow;
                int newCol = dir[1] + currCol;
                //niche wale last case mein yeh bhi dekh lena ki initialCOlor ke equal ho
                if(newRow >=0 && newRow < n && newCol >=0 && newCol <m && initialColor == image[newRow][newCol]){
                    q.add(new int[]{newRow, newCol});
                    image[newRow][newCol] = color;
                }
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];
        if(initialColor == color)return image;  ///as agar pehle se same rang hai toh infinite chalta rahega
        dfs(image, sr, sc, color, initialColor);
        return image;
    }
}