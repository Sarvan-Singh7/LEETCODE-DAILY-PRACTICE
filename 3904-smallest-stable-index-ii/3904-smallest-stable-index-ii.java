class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int maxPrefix[] = new int[n];
        int minPrefix[] = new int[n];
        for(int i=0; i<n;i++){ ////o to i tak ka prefix MAX
              maxi = Math.max(nums[i], maxi);    
              maxPrefix[i] = maxi;
        }
        for(int i=n-1; i>=0;i--){//i to n-1 tak ka Suffix so start from last
            mini = Math.min(nums[i], mini);
            minPrefix[i] = mini;
        }
        for(int i=0; i<n;i++){ ///compare and return;
            if(maxPrefix[i] - minPrefix[i] <=k){
                return i;
            }
        }
        return -1;
    }
}