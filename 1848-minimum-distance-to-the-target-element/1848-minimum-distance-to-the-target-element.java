class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int min_value = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                min_value = Math.min(Math.abs(i - start), min_value);
            }
        }
        return min_value;
    }
}