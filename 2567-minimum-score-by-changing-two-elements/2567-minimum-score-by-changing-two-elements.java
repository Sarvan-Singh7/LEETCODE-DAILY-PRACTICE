class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        ///as 2 elements change kar sakte hai toh hum unhe same value se save karenge so minimum or Low score is 0
        ///and hum 3 tareke se unhe discard karenge as we want maximum in High Score so we will play with extremes 
        ///means agar first two change hue so 3rd index and last index ke value se high niklega
        ///agar first and last element replace so high score will be from 2nd and n-2 index

        /////CALCULATING HIGH SCORE AS LOW WILL BE 0 as minimum--------
        int n = nums.length;
        int changeFirstTwo = nums[n-1] - nums[2];///as first tw
        int changeLastTwo = nums[n-3] - nums[0];
        int changeFirstAndLast= nums[n-2] - nums[1];

        return Math.min(changeFirstTwo, Math.min(changeLastTwo, changeFirstAndLast));
    }
}