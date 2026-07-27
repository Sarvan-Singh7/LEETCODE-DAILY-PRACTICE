class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int i = 0;
        int j = n -1;
        while(i<j){
            maxi = Math.max((nums[i]-1)*(nums[j]-1), maxi);
            if(nums[i] < nums[j]){
                i++;
            }
            else j--;
        }
        return maxi;
    }
}