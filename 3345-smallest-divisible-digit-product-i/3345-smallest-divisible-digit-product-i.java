class Solution {
    public int smallestNumber(int n, int t) {
        int equal = n;
        while(n <=150){
            int prod = 1;
            int temp = n;
            while(temp != 0){
                int ld = temp % 10;
                prod = prod * ld;
                temp/=10;
            }
            if(prod % t == 0){
                return n;
            }
            n++;
        }
        return n;
    }
}