class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int maxi = Integer.MAX_VALUE;
        for(int i=k-1;i<nums.length;i++){
            int maxio = nums[i] - nums[i-k+1];
            maxi =Math.min(maxi,maxio);
        }
        return maxi;
    }
}