class Solution {
    public int f(String s1, String s2, int m, int n, int arr[][]){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    arr[i][j] = 1 + arr[i-1][j-1];
                }else{
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        return arr[m][n];
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int arr[][] = new int[m +1][n + 1];
        int ansLCS = f(str1, str2, m, n, arr);
        int len = m + n - ansLCS;
        StringBuilder sb = new StringBuilder();
        
        while(m>0 && n>0){
            if(str1.charAt(m-1) == str2.charAt(n-1)){
                sb.append(str1.charAt(m-1));
                m--;
                n--;
            }
            else if(arr[m-1][n] > arr[m][n-1]){
                sb.append(str1.charAt(m-1));
                m--;
            }
            else{
                sb.append(str2.charAt(n-1));
                n--;
            }
        }
        while(m>0){
          sb.append(str1.charAt(m-1));  
          m--;
        }
        while(n>0){
            sb.append(str2.charAt(n-1));
            n--;
        }
        return sb.reverse().toString();
    }
}