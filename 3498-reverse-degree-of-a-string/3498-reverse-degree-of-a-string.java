class Solution {
    public int reverseDegree(String s) {
        int answer =0;
        int arr[] = new int[26];
        int a = 26;
        for(int i= 0; i<26;i++){
            arr[i] = a--;
        }
        
        for(int i =0; i<s.length();i++){
            int ch = (int)arr[s.charAt(i) - 97];
            answer = answer + (ch * (i+1));
        }
        return answer;
    }
}