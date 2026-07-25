class Solution {
    public int maxProduct(int n) {
        int maxi = Integer.MIN_VALUE;
        while(n > 0){
            int ld = n % 10;
            n/=10;
            int m = n;
            int mul = 1;
            while(m > 0){
                int l = m % 10;
                mul = l * ld;
                maxi = Math.max(mul, maxi);
                mul = 1;
                m/=10;
            }
        }
        return maxi;
    }
}