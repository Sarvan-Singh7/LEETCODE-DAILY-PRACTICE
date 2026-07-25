class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ones = 0;
        int m = mat.length;
        int n = mat[0].length;
        int index = 0;
        for(int i = 0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum = sum + mat[i][j];
            }
            if(ones < sum){
                ones = sum;
                index = i;
            }
        }
        int[] arr = {index, ones};
        return arr;
    }
}