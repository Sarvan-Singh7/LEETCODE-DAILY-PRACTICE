class Solution {
    public String[] createGrid(int m, int n) {
            String[] arr = new String[m];
            for(int i=0; i<m;i++){///see output as we did it like starting and last toh hoga so ulte L ki shape mein ho jaega
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<n;j++){
                    if(i==0 || j == n-1){
                        sb.append('.');
                    }
                    else{
                        sb.append('#');
                    }
                }
                arr[i] = sb.toString();
            }
            System.out.println(arr);
            return arr;
    }
}