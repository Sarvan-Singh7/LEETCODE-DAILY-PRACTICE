class Solution {
    public boolean check(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int start = 0, end = s.length() -1;
        StringBuilder sb = new StringBuilder();
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(check(s, i, j)){
                    int len = j-i+1;
                    if(maxi < len){
                        start = i;
                        end = j;
                        maxi = len;
                    }
                }
            }
        }
        for(int i=start; i<=end;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}