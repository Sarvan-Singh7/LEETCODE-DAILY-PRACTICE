class Solution {
    public int findMin(int[] nums) {
        int maxi = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
             if(nums[i]<maxi){
                maxi=nums[i];
             }
        }
        return maxi;
    }
}