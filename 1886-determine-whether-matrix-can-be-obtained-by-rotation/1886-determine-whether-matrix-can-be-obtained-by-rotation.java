class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n= mat.length;
        for(int i=0;i<4;i++){
            rotate(mat);
            if(matchIt(mat, target)){
                return true;
            }
        }
        return false;
    }
    public void rotate(int[][]mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<=i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0;i<mat.length;i++){
            int si =0, ei = mat.length -1;
            while(si < ei){
                int temp = mat[i][si];
                mat[i][si] = mat[i][ei];
                mat[i][ei] = temp;
                si++;
                ei--;
            }
        }
        
    }
    public boolean matchIt(int [][]mat, int[][]target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

}