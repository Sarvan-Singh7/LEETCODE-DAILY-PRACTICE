class Solution {
    public int longestStrChain(String[] words) {
        int n = words.length;
        int dp[] = new int[n];////just to find maximum length of a subsequence
        Arrays.sort(words, (a, b) -> a.length() - b.length());////sorting according to LENGTH, (not by String) important as we are applying LIS
        int maxi =1;
        Arrays.fill(dp, 1);
        for(int i=0;i<n;i++){
            for(int j=0; j<i;j++){
                if(checkPosition(words[i], words[j]) && dp[j] +1 > dp[i]){
                    dp[i] = dp[j] + 1;
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }

        return maxi;
    }

    public static boolean checkPosition(String s1, String s2){ //s1 shall be greater in size by 1 from s2 so to get true
        if(s1.length() != s2.length() +1)return false;   //as s1 , s2 se ek step bada hona chahiye

        int first =0, second =0;
        while(first < s1.length() && second < s2.length()){
            if(s1.charAt(first) == s2.charAt(second)){
                first++;
                second++;
            }
            else{
                first++;
            }
        }
        return (second == s2.length());

    }
}