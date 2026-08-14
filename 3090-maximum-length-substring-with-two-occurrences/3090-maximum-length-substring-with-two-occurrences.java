class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int left =0, right =0,maxi =0;
        int hash[] = new int[26];
        for(right =0; right<n;right++){
            char ch = s.charAt(right);
            hash[ch - 'a']++;
            while(hash[s.charAt(right) - 'a'] >2){
                hash[s.charAt(left) - 'a']--;
                left++;
            }
            maxi = Math.max(maxi, right - left +1);
        }
        return maxi;
    }
}