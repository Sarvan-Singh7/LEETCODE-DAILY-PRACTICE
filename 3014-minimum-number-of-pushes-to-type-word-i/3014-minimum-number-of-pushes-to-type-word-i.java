class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int count =0;
        if(word.length() <= 8)return word.length();
        for(int i=0; i<n;i++){
            count+= (i/8) + 1;
        }
        return count;

    }
}