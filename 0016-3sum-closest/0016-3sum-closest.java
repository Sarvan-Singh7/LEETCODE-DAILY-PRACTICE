class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i<=n-3;i++){
            for(int j =i+1; j<n;j++){
                for(int k = j+1; k<n;k++){
                    int sumInner = nums[i] + nums[j] + nums[k];
//niche wali condition used to campare mst closest so AMth.min used as closest so difference between 2 is minimal and updated.
                    if(Math.abs(target - sumInner) < Math.abs(target - sum)){
                        sum =  sumInner;
                    }
                }
            }
        }
        return sum;
    }
}