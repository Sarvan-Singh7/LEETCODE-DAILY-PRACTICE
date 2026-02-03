// class Solution {
//     ///step 4   convert 2D char Array into  String list
//     List<String> ConstructBoard(char [][] board){
//         List<String> res = new ArrayList<>();
//         for(char [] row : board){
//             res.add(new String(row));
//         }
//         return res;
//     }

//     //step 3 : verify the call
//     boolean isValidCell(char [][] board, int row, int col){
//         int n = board.length;

//         //check horizontally
//         for(int i=0;i<n;i++){
//             if(board[row][i] == 'Q')return false;
//         }


//         //check vertically
//         for(int i=0;i<n;i++){
//             if(board[i][col] == 'Q')return false;
//         }

//         //check left = upper diagonal  (row as well as column decrease)
//         for(int i=row -1,j=col-1;i>=0 && j>=0;i--,j--){
//             if(board[i][j] == 'Q')return false;
//         }

//         // check right = upper diagonal (row dcrease and column increase)
//         for(int i=row -1, j=col+1;i>=0 && j<n;i--,j++){
//             if(board[i][j] == 'Q')return false;
//         }
//         return true;//upper all conditions not valid
//     }
//     // step2 : place Queen in a valid cell
//     void PlaceQueens(int row, char[][] board, List<List<String>> res){
//         // base case
//         if(row == board.length){
//             res.add(ConstructBoard(board));
//             return;
//         }

//         //step 2 (a) start placing queens
//         for(int col =0;col< board.length;col++){
//             if(isValidCell(board, row, col)){
//                 board[row][col] = 'Q';
//                 // place remaining queens
//                 PlaceQueens(row +1, board, res);
//                 //undo operation
//                 board[row][col] = '.';
//             }
//         }
//     }
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> res = new ArrayList<>();

//         //step 1 " create 2D array chess noard"
//         char[][] board = new char[n][n];

//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j] = '.';
//             }
//         }

//         //place queens
//         PlaceQueens(0,board,res);
//         return res;
//     }
// }





class Solution {
    ///step 4 :  converting a 2D array of characters into a List of Strings.
    public static List<String> ConvertToString(char[][] board){
        List<String> StrList = new ArrayList<>();
        for(char[] row : board){
            StrList.add(new String(row));
        }
        return StrList;
    }
    ///step 3 : making isValidCell function for returning boolean response
    public static boolean isValidCell(char[][] board,int row, int col){
        int n= board.length;
        //check horizontal
        for(int i=0;i<n;i++){
            if(board[row][i] == 'Q')return false;
        }
        //check vertical;
        for(int j=0;j<n;j++){
            if(board[j][col] == 'Q')return false;
        }
        //check upper left diagonal
        for(int i=row-1,j=col-1; i>=0 &&j>=0; i--,j--){
            if(board[i][j] == 'Q')
            return false;
        }
        //check upper right diagonal
        for(int i=row-1,j=col+1 ; i>=0 && j<n ; i--,j++){
            if(board[i][j] == 'Q')
            return false;
        }
        return true;
    }
    //step 2 === making recursion fn
    public static void QueenAnswer(List<List<String>> result, char[][]board, int row){
        if(row == board.length){
            result.add(ConvertToString(board));
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isValidCell(board, row, col)){
                board[row][col] = 'Q';
                QueenAnswer(result,board, row+1);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        QueenAnswer(result,board,0);
        return result;
    }
}







































