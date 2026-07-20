class Solution {
    public int strStr(String haystack, String needle) {
        int index =0;
        int n = haystack.length();
        int m = needle.length();
        if(needle.length() > haystack.length())return -1;
        for(int i=0;i<= n-m; i++){   ///less than equal to
            if(haystack.substring(i, i + m).equals(needle))return i;
        }
        return -1;
    }
}