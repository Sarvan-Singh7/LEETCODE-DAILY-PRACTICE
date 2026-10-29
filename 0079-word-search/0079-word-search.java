class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean visited[][] = new boolean[m][n];///as same not used more than once so outside the loop
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                if(word.charAt(0) == board[i][j]){    ////Starting Index taken from here
                   boolean output = f(board, i,j,m,n, visited, word, 0);
                   if(output == true)return true; 
                }
                
                
            }
        }
        return false;
    }
    public static boolean f(char[][] board, int i, int j, int m, int n, boolean visited[][], String word, int index){
        if(index == word.length())return true;
        if(i <0 || j<0 || i>=m || j>=n || visited[i][j] ) return false;
        
        if(word.charAt(index) != board[i][j])return false;      //if not matching then return false
        visited[i][j] = true;                ////visited ki position yeh hi rakho
        boolean find =  (                   ///all four directions covered
            f(board, i+1, j, m, n, visited, word, index+1) ||
            f(board, i, j+1, m, n, visited, word, index+1) ||
            f(board, i-1, j, m, n, visited, word, index+1) ||
            f(board, i, j-1, m, n, visited, word, index+1)
        );
        visited[i][j] = false;////////////////////PLEASE MARK IT AS FALSE OTHERWISE WRONG OUTPUT
        return find;
    }
}