class Solution {
    public boolean isAnagram(String s, String t) {
        int Freq[] = new int[26];
        if(s.length() != t.length())return false;

        for(int i=0;i<s.length();i++){
            Freq[s.charAt(i) -'a']++;
            Freq[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++){
            if(Freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}