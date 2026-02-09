class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for(int i=0;i<n;i++){     /// transpose 
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            int si=0,ei = n-1;
            while(si<ei){
                int temp = matrix[i][si];   //row reverse
                matrix[i][si] = matrix[i][ei];
                matrix[i][ei] = temp;
                si++;
                ei--;
            }
        }

    }
}