class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int dp[] = new int[n];
        int parent[] = new int[n];
        int maxLength = 0;
        int lastIndex = 0;
        Arrays.fill(dp, 1);

        for(int i=0;i<n;i++){
            parent[i] = i; ///same index de diya and we will chenge that to previous divisible of found
            for(int j=0;j<i;j++){
                if(nums[i] % nums[j] == 0 && dp[i] < ( dp[j] + 1) ){
                    dp[i] = dp[j] +1;
                    parent[i] = j;  /// agar piche wala divisible so just store  its index to backtrack;
                }
            }
            if(dp[i] > maxLength ){
                maxLength = dp[i];
                lastIndex = i;
            }
        }
        ////Now Backtrack till parent element is not equalent to its index
        List<Integer> arr = new ArrayList<>();
        while(lastIndex != parent[lastIndex]){
            arr.add(nums[lastIndex]);
            lastIndex = parent[lastIndex];  //means jo usmen value hogi woh pichle index ki hogi
        }

        arr.add(nums[lastIndex]);  //necver forgot to add lastIndex
        return arr;
    }
}