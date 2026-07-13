class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int startRow =0;
  
        int endCol = m-1;

        while(startRow <= n-1 && endCol >=0){
            if(matrix[startRow][endCol] > target ){
                endCol--;
            }
            else if(matrix[startRow][endCol] < target){
                startRow++;
            }
            else if(matrix[startRow][endCol] == target){    
                return true;
            }
        }
        return false;

    }
}