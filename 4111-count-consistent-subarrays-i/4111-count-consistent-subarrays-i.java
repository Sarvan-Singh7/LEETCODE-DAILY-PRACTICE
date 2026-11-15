class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length;
        int count =0;
        for(int i=0; i<n;i++){
            int mini = nums[i];
            int bit = nums[i];
            for(int j=i; j<n;j++){
                mini = Math.min(mini, nums[j]);
                bit = (bit&nums[j]);
                if(mini == bit)count++;
            }
        }
        return count;
    }
}