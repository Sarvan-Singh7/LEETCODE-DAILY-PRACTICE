// class Solution {  ////TLE as Goes in O(N Cube) TC;
//     public static int f(String s, int i, int n, int dp[]){
//         //: Change base case to -1 so the last segment doesn't add an extra cut
//         if(i == n)return -1;///as -1 return because it wont add anymore

//         int mini = Integer.MAX_VALUE;
//         StringBuilder sb = new StringBuilder();
//         if(dp[i] != -1)return dp[i];
//         for(int j=i; j<n;j++){
//             sb.append(s.charAt(j));
//             if(isPalindrome(sb)){
//               int cost = 1 + f(s, j+1, n, dp);////as start from new index now so j+1 also to avoid infinite loop (SUMPLE J PASSED WILL RESULT IN RUNTIME ERROR)
//               mini = Math.min(mini, cost);  
//             }
            
//         }
//         return dp[i] = mini;
//     }
//     public static boolean isPalindrome(StringBuilder sb){
//         int i=0, j=sb.length() -1;
//         while(i<j){
//             if(sb.charAt(i) != sb.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public int minCut(String s) {
//         int n = s.length();
//         int dp[] = new int[n];
//         Arrays.fill(dp, -1);
//        return f(s, 0, n, dp); 
//     }
// }


class Solution {   ///O(n2) TC 
    public static boolean isPalindrome(String s, int i, int j){
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int minCut(String s) {

        int n = s.length();
        if(n==1)return 0;
        int dp[] = new int[n+1];
        // Base case initialization: f(s, n) returns -1-------------------------------------
        dp[n] = -1;
        for(int i=n-1; i>=0;i--){
            int mini =Integer.MAX_VALUE;
            for(int j=i; j<n;j++){
                if(isPalindrome(s, i, j)){
                    int cost = 1 +  dp[j+1]; ///j+1 used so dp size increased
                    mini = Math.min(mini, cost);  
                 }
            }
            dp[i] = mini;
        }  
        return dp[0];     
    }
}