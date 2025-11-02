class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int [][] arr = new int[m][n];
        for(int[] i : guards){
            arr[i[0]][i[1]] =1;
        }
        for(int [] i : walls){
            arr[i[0]][i[1]] =2;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] ==1){
                    int row,col;
                    row=i+1;
                    while(row<m && arr[row][j] != 1 && arr[row][j] != 2){
                        arr[row][j] = 3;
                        row++;
                    }
                    row = i-1;
                    while(row>=0 && arr[row][j] != 1 && arr[row][j] != 2){
                        arr[row][j] = 3;
                        row--;
                    }
                    col = j+1;
                    while(col < n && arr[i][col] !=1 && arr[i][col] != 2){
                        arr[i][col] = 3;
                        col++;
                    }
                    col = j-1;
                    while(col >= 0 && arr[i][col] !=1 && arr[i][col] != 2){
                        arr[i][col] = 3;
                        col--;
                    }
                }
            }
        }
        int countAnswer =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] ==0){
                    countAnswer++;
                }
            }
        }
        return countAnswer;
    }
}