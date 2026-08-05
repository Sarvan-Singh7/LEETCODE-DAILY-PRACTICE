class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxIndex =0;
        int si =0, ei = 0;
        while(si<n-1){
            maxIndex = Math.max(maxIndex, si+nums[si]);

            if(si == ei){
                count++;
                ei = maxIndex;
            }
            si++;
        }
        return count;
    }
}  