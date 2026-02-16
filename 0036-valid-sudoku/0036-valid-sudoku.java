class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == '.'){
                    continue;//do not check if . come
                }
                //check for row
                if(!set.add(board[i][j] + "in row" + i)){
                    return false;
                }
                //check for column
                if(!set.add(board[i][j] + "in column" + j)){
                    return false;
                }
                //check for small box
                if(!set.add(board[i][j] + "In a small SubBox + " + i/3 + j/3)){
                    return false;
                }
            }
        }
        return true;
    }
}