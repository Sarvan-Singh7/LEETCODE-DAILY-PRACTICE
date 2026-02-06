class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0,right =0, n= nums.length;
        int ans = n+1;
        while(left < n){
            while(right <n && nums[right] <= (long)nums[left] * k){
                right++;
                
            }
            ans = Math.min(ans, (n-(right - left)));
            left++;
        }
        return ans;
    }
}