class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}