class Solution {
    public int mirrorDistance(int n) {
        int rev =0;
        int num = n;
        while(num >0){
            rev *=10;
            int ld = num%10;
            rev += ld;

            num = num/10;
        }

        return Math.abs(n - rev);
    }
}