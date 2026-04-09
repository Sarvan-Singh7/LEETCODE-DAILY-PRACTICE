class Solution {
    public boolean isPowerOfTwo(int n) {
        int count =0;
        for(int i=0;i<31;i++){
            if(n%2 == 1){
                count++;
            }
            n=n>>1;
        }
        return count ==1;
    }
}