class Solution {
    public int findNumberOfLIS(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        int cnt[] = new int[n];
        int maxLength = 0;
        int count =0;
        for(int i=0;i<n;i++){
            dp[i] = 1;
            cnt[i] = 1;  // please set it to 1
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j] && dp[j] +1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    //inherit
                    cnt[i] = cnt[j];   ///cnt[i] reset to cnt[j]
                }
                else if(arr[i] > arr[j] && dp[j] +1 ==  dp[i]){
                    //increase the count
                    cnt[i] += cnt[j];
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        for(int i=0;i<n;i++){
            if(dp[i] == maxLength){
                count+= cnt[i];
            }
        }
        return count;
    }
}