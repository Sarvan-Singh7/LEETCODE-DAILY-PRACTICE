class Solution {
    public long maxAlternatingSum(int[] nums) {
        Arrays.sort(nums);
        ///first we know that array first half now contributes to negatives as smaller so minus hoge, and second half to positive as plus honge

        int n = nums.length;
        for(int i=0; i<n;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        long answer=0;
        ///as first half minus and second half plus
        for(int i=0; i<n/2;i++){
            answer -= nums[i];
        }
        for(int i=n/2; i<n;i++){
            answer += nums[i];
        }
        return answer;
    }
}