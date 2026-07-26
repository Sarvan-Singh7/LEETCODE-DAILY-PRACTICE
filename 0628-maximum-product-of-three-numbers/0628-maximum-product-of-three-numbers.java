class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       int n = nums.length;
       int a = nums[n-1];
       int b = nums[n-2];
       int c = nums[n-3];
       return Math.max( a*b*c , nums[0] * nums[1]* nums[n-1]);

    }
}