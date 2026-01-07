////BRUTE----------------------------------------------------------

// class Solution {

//     void markRow(int[][] matrix, int i, int m, int n){
//             for(int j=0 ; j<m ; j++){
//                 if(matrix[i][j] != 0){
//                 matrix[i][j] = -1;
//                 }
//             }
//         }


//     void markColumn(int[][] matrix, int j, int m, int n){
//             for(int i=0;i<n;i++){
//                 if(matrix[i][j] != 0){   ///////////////////////////////////this condition of if is mendatory as i want to covert only those....
//                 matrix[i][j] = -1;
//                 }
//             }
//         }
//     public void setZeroes(int[][] matrix) {
        
        
//         int n= matrix.length;
//         int m=matrix[0].length;
//         for(int i=0;i<n;i++){     //start
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j] == 0){
//                     markRow(matrix, i, m, n);    // i passed means i constant so i will do operation on j so means one full row covered in one iteration
//                     markColumn(matrix, j, m, n);
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){        /// at last convert back to zeroes.
//             for(int j=0;j<m; j++){
//                 if(matrix[i][j] ==-1){
//                     matrix[i][j] =0;
//                 }
//             }
//         }
//         return;
//     }
// }
/////////////////////////////////////BETTER-------------------------------------------------------------------



// class Solution {

//     public void setZeroes(int[][] matrix) {
//         int n= matrix.length;
//         int m= matrix[0].length;
//         int []row = new int[n];
//         int []column = new int[m];
//         for(int i=0;i<n;i++){                   //pehle loop chala kar row and column matrix mein woh rows and column mark kar liye jo ki zero hai as 1
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j] == 0){
//                     row[i] = 1;
//                     column[j] =1;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(row[i] ==1 || column[j] ==1){   //now jo bhi 1 hai un sab ki rows and columns ke element ko zero kar do
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
       
//     }
// }

class Solution {

    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n];
        int column[] = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] ==1 || column[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        
       
    }
}