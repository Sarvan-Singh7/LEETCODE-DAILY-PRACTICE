class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0, prod =1;
        int m =n;
        while(m>0){
            int ld = m%10;
            sum+= ld;
            prod *=ld;
            m/=10;
        }
        return n%(sum + prod) ==0;
    }
}