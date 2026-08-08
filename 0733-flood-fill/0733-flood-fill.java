class Solution {
    public static void dfs(int[][] image, int row, int col, int color, int initialColor){
        int n = image.length;
        int m = image[0].length;
        if(row <0 || row >=n || col < 0 || col >=m)return;
        if(image[row][col] != initialColor)return; //as jo rang sabse pehle tha ushi ke sare same rang walon ko color dena hai, bakiyon ko nahin
        image[row][col] = color;  //agar color ke barabar nahin hai so nahin karna

        dfs(image, row -1, col, color , initialColor);//up
        dfs(image, row, col -1, color , initialColor);//left
        dfs(image, row + 1, col, color , initialColor);//down
        dfs(image, row, col + 1, color , initialColor);//right
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];
        if(initialColor == color)return image;  ///as agar pehle se same rang hai toh infinite chalta rahega
        dfs(image, sr, sc, color, initialColor);
        return image;
    }
}