class Solution {
    public boolean checkBalanced(int[] freq){
        int common =0;
        for(int i=0;i<26;i++){
            if(freq[i] == 0)continue;
            if(common ==0)common =freq[i];
            if(freq[i] != common)return false;
        }
        return true;
    }
    public int longestBalanced(String s) {
        int maxii =0;
        for(int i=0;i<s.length();i++){
            int freq[] = new int[26];
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                if(checkBalanced(freq)){
                    maxii = Math.max(maxii, j-i+1);
                }
                
            }
        }
        return maxii;
    }
}