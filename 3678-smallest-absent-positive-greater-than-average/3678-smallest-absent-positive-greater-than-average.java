class Solution {
    public int smallestAbsent(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            sum += nums[i];
            set.add(nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }
        double avg = sum/n;
        for(int i=-100; i<= 100+1; i++){
            if(!set.contains(i) && i > avg && i>=0){
                return i;
            }
        }
        return 1;
    }
}