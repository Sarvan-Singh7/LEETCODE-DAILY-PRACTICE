class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        int lastIndex[] = new int[26];
        //har element ka lastIndex calculate kar lo toh ki pata chal jaye ki agar i wala element j wali position pe aa sakta hai toh daal sake
        for(int i=0; i<n; i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        boolean visited[] = new boolean[26];//for unique elements
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(visited[ch - 'a'] == true)continue; ////agar pehle se visit ho chuka so continue;
            while(sb.length() > 0 && sb.charAt(sb.length() -1) > ch && lastIndex[sb.charAt(sb.length() - 1) - 'a'] > i){
                
                visited[sb.charAt(sb.length() - 1) - 'a'] = false;  ///jo c=delete kiya\
                sb.deleteCharAt(sb.length() - 1);   ///stringBuilder ke last wala character remove 
            }
            sb.append(ch);
            visited[ch - 'a'] = true;
        }
        return sb.toString();
    }
}