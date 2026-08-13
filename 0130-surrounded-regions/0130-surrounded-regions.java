class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        //mai pehle column ki boundry ke zeroes ko 'T' mark karta hun agar boundry 0 se koi aur 0 connect so usse bhi
        for(int i=0; i<row; i++){
            dfs(board, i, 0);
            dfs(board, i, col-1);
        }
        //boundry rows ko karo
        for(int j =0; j<col; j++){
            dfs(board, 0, j);
            dfs(board, row-1, j);
        }

        ///now those markded as 'T' are to be 0's and rest '0's to be 'X'

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
    public static void dfs(char[][] board, int row, int col){
        int m = board.length;
        int n = board[0].length;
        if(row <0 || row >=m || col <0 || col >=n || board[row][col] != 'O'){//agar 'T' ya 'X' hua so no work on boundry
            return;
        }
        //agar boundry wala 'X' nahin hai  so use 'T'  mark kardo
        board[row][col] = 'T';

        dfs(board, row-1, col);//up
        dfs(board, row, col +1);///right
        dfs(board, row+1, col);///down
        dfs(board, row, col-1);//left
    }
}