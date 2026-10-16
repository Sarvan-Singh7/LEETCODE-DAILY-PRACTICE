class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int i =0; i<n;i++){
            String s = words[i];
            String rev = new StringBuilder(s).reverse().toString();
            if(s.equals(rev))return s;
        }
        return "";
    }
}