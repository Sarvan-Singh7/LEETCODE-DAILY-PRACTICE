class Solution {
    public int longestSubsequence(int[] nums) {
        int xor =0;
        int len = nums.length;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        if(xor !=0)return nums.length;
        boolean allzeroes=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                allzeroes= false;
                break;
            }
        }
        if(allzeroes)return 0;
        
        return len-1;
    }
}