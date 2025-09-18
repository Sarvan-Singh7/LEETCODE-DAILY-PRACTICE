class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumN=n*(n+1)/2;
        int sumEl=0;
        for(int i=0;i<n;i++){
            sumEl+=nums[i];
        }
        return sumN-sumEl;
    }
}