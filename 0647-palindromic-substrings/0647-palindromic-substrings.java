class Solution {
    public static boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
       int count =0 ;
       int n = s.length();
     for(int i=0; i<n;i++){
        for(int j=i;j<n;j++){
            if(isPalindrome(s, i, j)){
                count++;
            }
        }
       }
       return count;
    }
}