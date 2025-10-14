class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]>='A' && str[i] <= 'Z'){
                str[i] = (char)(str[i] + 32);    //as we know that(A==65  && a==97) so 97 - 65 is 32 so ass 32 to it
            }
        }
        return new String(str);    /////Have to return new String so str.toString() not valid
    }
}