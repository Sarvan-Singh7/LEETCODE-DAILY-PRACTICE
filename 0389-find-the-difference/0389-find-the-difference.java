class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;
        for(int i=0;i<s.length();i++){
            int n=(int)s.charAt(i);
            sum1+=n;
        }
        for(int i=0;i<t.length();i++){
            int n=(int)t.charAt(i);
            sum2+=n;
        }
        char answer = (char)(sum2 - sum1);
        return answer;
    }
}