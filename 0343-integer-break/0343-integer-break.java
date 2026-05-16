class Solution {
    public int integerBreak(int n) {
        int answer = 1;
        if(n <= 3)return n-1;
        while(n>4){
            answer = answer *3;
            n= n-3;
        }
        return answer *n;
    }
}