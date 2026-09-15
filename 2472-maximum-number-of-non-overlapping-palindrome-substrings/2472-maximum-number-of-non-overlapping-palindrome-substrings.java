class Solution {
    public static boolean isPalindrome(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int count =0;
        int i =0;
        while(i <= n-k){
            if(isPalindrome(s, i, i+k-1)){
                count++;
                i += k;
            }
            else if(i + k < n && isPalindrome(s, i, i+k)){
                count++;
                i += k+1;
            }
            else{
                i++;
            }
        
    }
    return count;
}
}