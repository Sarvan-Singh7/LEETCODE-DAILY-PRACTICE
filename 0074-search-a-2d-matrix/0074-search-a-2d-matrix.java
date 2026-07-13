class Solution {
    public boolean BinarySearch(int arr[], int target){
        int i=0;
        int j=arr.length -1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(target == arr[mid] )return true;
            else if(target > arr[mid])i = mid+1;
            else  j= mid -1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {//TC = O(n) + O(logn)
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0] <= target && matrix[i][m-1] >= target){
                if(BinarySearch(matrix[i], target)){
                    return true;
                }
            }
        }
        return false;
    }


    // public boolean searchMatrix(int[][] matrix, int target) {   //////O(logN) TC  as Solved
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     int startRow =0;
    //     int endRow = n-1;
    //     int startCol = 0;
    //     int endCol = m-1;

    //     while(startRow <= endRow && endCol >=0){
    //         if(matrix[startRow][endCol] > target ){
    //             endCol--;
    //         }
    //         else if(matrix[startRow][endCol] < target){
    //             startRow++;
    //         }
    //         else if(matrix[startRow][endCol] == target){    
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}