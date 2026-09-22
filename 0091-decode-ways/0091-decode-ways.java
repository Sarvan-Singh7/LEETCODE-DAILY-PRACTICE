class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return f(s, 0, dp);
    }

    public static int f(String s, int index, int dp[]){
        if(index == s.length())return 1;///return 1 as all valid decoding
        if(s.charAt(index) == '0')return 0;
        if(dp[index] != -1)return dp[index];
        int ways = f(s, index +1, dp);/////way to decode one character
        //now decode two characters if possile
        if(index + 1 < s.length() && Integer.parseInt(s.substring(index, index+2)) <= 26){//utna part break karo substring banakar example 2 characters and convert that two characters to Integer to Compare
            ways += f(s, index+2, dp);
        }
        return dp[index] = ways;
    }
}