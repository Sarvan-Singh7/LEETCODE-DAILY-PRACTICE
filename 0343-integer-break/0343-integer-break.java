class Solution {
    public int integerBreak(int n) {
        int result =1;
        if(n<=3)return n-1;
        while(n > 4){
            result *= 3;   //multiply karna hai ji
            n= n-3;
        }
        return result *n;
    }
}