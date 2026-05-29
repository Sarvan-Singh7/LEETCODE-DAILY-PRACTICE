class Solution {
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            int sum =0;
            while(val !=0){
                sum += val%10;
                val/=10;
            }
            nums[i] = sum;
            mini = Math.min(mini, nums[i]);
        }
        return mini;
    }
}