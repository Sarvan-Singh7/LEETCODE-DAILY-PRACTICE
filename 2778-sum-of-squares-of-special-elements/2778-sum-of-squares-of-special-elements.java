class Solution {
    public int sumOfSquares(int[] nums) {
        int answer =0;
        int n = nums.length;
        for(int i=0; i<nums.length;i++){
            if(n%(i+1) ==0){
                answer += (nums[i] *nums[i]);
            }
        }
        return answer;
    }
}