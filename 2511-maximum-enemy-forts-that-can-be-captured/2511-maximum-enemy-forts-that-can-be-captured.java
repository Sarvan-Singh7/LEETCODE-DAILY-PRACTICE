class Solution {
    
    public int captureForts(int[] forts) {
        int maxi = 0;
        int n = forts.length;
        for(int i=0; i<n;i++){
            if(forts[i] == -1){
                int n2 =i;
                for(int j = n2-1; j >=0;j--){
                    if(forts[j] == -1)break;
                    if(forts[j] == 1){
                        System.out.println(i + " " + j);
                        maxi = Math.max(maxi, Math.abs(i-j-1));
                        break;
                    }
                }
                for(int j=n2+1;j<n;j++){
                    if(forts[j] == -1)break;
                    if(forts[j] == 1){
                        
                        System.out.println(i + " " + j);
                        maxi = Math.max(maxi,Math.abs(j-i-1) );
                        break;
                    }
                    
                }
            }
        }
        return maxi;
    }
}