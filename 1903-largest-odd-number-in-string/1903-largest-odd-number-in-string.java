class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        
        int lastIndex =0-1;
        for(int i=n-1; i>=0;i--){
            int ld = num.charAt(i) - '0';
            if(ld%2 != 0){
                lastIndex = i;
                break;
            }
        }
        if(lastIndex == -1)return "";  ///means if it not Updated
        return num.substring(0, lastIndex+1);   // lastIndex+1
    }
}