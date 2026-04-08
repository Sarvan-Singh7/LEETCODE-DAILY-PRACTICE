class Solution {
    ///IF SAME NUMBER XOR WITH SAME NUMBER OF IT SO ANSWER =0
    //IF DIFFERENT SO ANSWER = 1;
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int answer=0;
        for(int i=0;i<n;i++){
            answer = answer ^ nums[i];     //note that XOR used and it returns 1 at 0^1 so it will store unique number in answer;
        }
        return answer;
    }
}