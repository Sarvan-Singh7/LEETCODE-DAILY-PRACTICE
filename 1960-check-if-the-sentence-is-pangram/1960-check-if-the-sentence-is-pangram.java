class Solution {
    public boolean checkIfPangram(String sentence) {
        int Freq[] = new int[26];
        if(sentence.length()<26){return false;}
        for(int i=0;i<sentence.length();i++){
            Freq[sentence.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(Freq[i] ==0){
                return false;
            }
        }
        return true;
    }
}