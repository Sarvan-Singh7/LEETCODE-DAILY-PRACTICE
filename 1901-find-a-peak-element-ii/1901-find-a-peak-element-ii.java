class Solution {///extreme  Brute as Calculated Largest Element AS IT WILLL BE GREATER THAN ALL
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[2];
        ///via this while loop we iterate through columns
        int i = 0, j = n-1;
        while(i<=j){
            int mid = i + (j - i)/2;
            //us particular column pe puri row ka max index de do
            int row = findMaxIndex(mat, mid);

            int left = (mid - 1) >=0 ? mat[row][mid -1]: Integer.MIN_VALUE;
            int right = (mid +1) <n ? mat[row][mid +1] : Integer.MIN_VALUE;

            if(left < mat[row][mid] && right < mat[row][mid]){
                arr[0] = row; arr[1] = mid;
                return arr;
            }
            else if(left > mat[row][mid]){
                j = mid -1;
            }
            else{
                i = mid + 1;
            }
        }
        arr[0] = -1; arr[1] = -1;
        return arr;   //dummy return as if upper one not executes;
    }
    public static int findMaxIndex(int arr[][], int col){
        int maxi = 0;
        int rowIndex =0;
        for(int i=0; i< arr.length; i++){
            if(maxi < arr[i][col]){
                rowIndex = i;
                maxi = arr[i][col];
            }
        }
        return rowIndex;
    }
}

// class Solution {///extreme  Brute as Calculated Largest Element AS IT WILLL BE GREATER THAN ALL
//     public int[] findPeakGrid(int[][] mat) {
//         int m = mat.length;
//         int n = mat[0].length;
//         int maxi = 0;
//         int rowIndex =0, colIndex = 0;
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if(mat[i][j] > maxi){
//                     maxi = mat[i][j];
//                     rowIndex = i;
//                     colIndex = j;
//                 }
//             }
//         }
//         int arr[] = {rowIndex, colIndex};

//         return arr;
//     }
// }