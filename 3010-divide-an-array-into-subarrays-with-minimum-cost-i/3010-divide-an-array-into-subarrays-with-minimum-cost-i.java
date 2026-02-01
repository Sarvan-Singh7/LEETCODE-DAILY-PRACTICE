class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        int minimum1 = Integer.MAX_VALUE;
        int minimum2 = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < minimum1){
                minimum2 = minimum1;
                minimum1 = nums[i];
            }
            else if(nums[i] < minimum2){
                minimum2 = nums[i];
            }
        }
        return sum + minimum1+minimum2;
    }
}