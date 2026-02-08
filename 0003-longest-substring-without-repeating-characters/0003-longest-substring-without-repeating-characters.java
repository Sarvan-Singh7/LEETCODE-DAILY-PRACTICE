class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() ==0)return 0;
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            int Hashing[] = new int[256];
            
            for(int j=i;j<s.length();j++){
                int index = s.charAt(j);
                if(Hashing[index] ==1){
                    break;
                }
                maxLength = Math.max(maxLength, j-i+1);
                Hashing[index] =1;
            }
        }
        return maxLength;
    }
}