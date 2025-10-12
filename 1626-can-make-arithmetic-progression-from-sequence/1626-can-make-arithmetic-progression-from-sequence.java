class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n=arr.length;
        if(n==1)return true;
        Arrays.sort(arr);
        int CommonDifference = arr[1] -arr[0];
        for(int i=0;i<n-1;i++){
            if(arr[i+1] - arr[i] !=CommonDifference){
                return false;
            }
        }
        return true;
    }
}