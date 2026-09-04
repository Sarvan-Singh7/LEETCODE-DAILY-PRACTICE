class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        int smallestIndex=-1;
        int smallestValue=Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            int maxi = Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;

            for(int j=0;j<=i;j++){//for maximum
                maxi = Math.max(maxi, nums[j]);
            }
            for(int j=i; j<n;j++){//for minimum;
                mini = Math.min(mini, nums[j]);
            }
            if(maxi-mini <=k){
                if(smallestValue > maxi-mini){
                    smallestValue = maxi-mini;
                    smallestIndex=i;
                    return smallestIndex;
                }
            }
        }
        return smallestIndex;
    }
}