class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            int st=0 , end=n-1;
            while(st<end){
                int temp=arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = temp;
                st++;
                end--;
            }
            for(int j=0;j<n;j++){
                if(arr[i][j] ==0){
                    arr[i][j] =1;
                }
                else{
                    arr[i][j] =0;
                }
            }
        }
        return arr;
    }
}