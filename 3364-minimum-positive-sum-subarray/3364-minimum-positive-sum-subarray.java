class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            int sum =0;
            for(int j=i; j<n;j++){
                sum+= nums.get(j);
                if(j-i+1 >= l && j-i+1 <=r && sum > 0){
                    mini = Math.min(mini, sum);
                }
            }
        }
        return (mini == Integer.MAX_VALUE)?-1:mini;
    }
}