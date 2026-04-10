class Solution {
    public int matrixScore(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){            //making first column 0s to one
            if(grid[i][0] == 0){ //agar fist column ka koi element zero toh woh column ke pure elements flip kardo ji
                for(int j=0;j<col;j++){
                    grid[i][j] ^=1;   //main
                }
            }
        }
        ////now i will make that columns flip which has ones count lesser than zeros count

        for(int j=0;j<col;j++){ //iterate from column as to see column wise
            int ones =0,zero=0;
            for(int i=0;i<row;i++){
                if(grid[i][j] ==0)zero++;
                else ones++;
            }
            if(zero > ones){
                for(int i=0;i<row;i++){
                    grid[i][j] ^=1;
                }
            }
        }
        ///now calculating all row full decimal integer addition without converting
        int pow =1, sum=0;
        for(int j=col -1;j>=0;j--){
            int ones =0;
            for(int i=0;i<row;i++){
                if(grid[i][j] == 1)ones++;
            }
            sum+= pow * ones;
            pow *=2;

        }
        return sum;

    }
}