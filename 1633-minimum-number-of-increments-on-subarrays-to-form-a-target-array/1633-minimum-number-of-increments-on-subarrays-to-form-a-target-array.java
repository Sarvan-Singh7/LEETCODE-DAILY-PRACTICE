class Solution {
    public int minNumberOperations(int[] target) {
        int sum=target[0];
        int n= target.length;
        for(int i=0;i<n-1;i++){
            if(target[i+1] > target[i]){
                sum+= target[i+1] - target[i];
            }
        }
        return sum;


    }
}