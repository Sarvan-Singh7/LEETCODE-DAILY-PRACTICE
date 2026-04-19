class Solution {
    public long subArrayRanges(int[] nums) {
        long sum =0;
        for(int i=0;i<nums.length;i++){
            int maxi = nums[i],mini =nums[i];
            for(int j=i;j<nums.length;j++){  //started from  i as nums[i] assigned above
                mini = Math.min(mini, nums[j]);
                maxi = Math.max(maxi, nums[j]);
                sum += maxi - mini;
            }
        }
        return sum;
    }
}