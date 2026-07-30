class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int count =0;
        if(word.length() <= 8)return word.length();
        for(int i=0; i<n;i++){
            count+= (i/8) + 1;///only think about remnainder as agar 16 se kam so remainder 1 hi ayega so 16 tak 2 add hota rahega
        }
        return count;

    }
}