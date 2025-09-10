class Solution {
    public int diagonalSum(int[][] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==(n-1)){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}