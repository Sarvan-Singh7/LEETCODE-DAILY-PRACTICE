class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
            int i=0,j=column-1;
            while(i<row && j>=0){
                if(target < matrix[i][j]){
                    j--;
                }
                else if(target > matrix[i][j]){
                    i++;
                }
                else return true;
            }
        return false;
    }
}