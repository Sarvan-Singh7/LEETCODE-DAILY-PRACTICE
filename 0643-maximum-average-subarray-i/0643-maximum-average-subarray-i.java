class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left =0;
        int right =0;
        double sum =0;
        double maxi = (double)Integer.MIN_VALUE;
        for(right =0;right <n;right++){
            sum += nums[right];
            if(right - left +1 == k){
                int divide = right - left+1;
                maxi = Math.max(sum/divide, maxi);

                sum -= nums[left];
                left++;
            }
        }
        return maxi;
    }
}