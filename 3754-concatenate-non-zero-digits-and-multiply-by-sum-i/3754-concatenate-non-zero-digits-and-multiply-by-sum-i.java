class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        while(n>0){
            if(n%10 != 0){
              x = x*10;
            long ld = n%10;
            x = x + ld;  
            }
            
            n/=10;
        }
        long rev = 0; //reversing it
        while(x>0){
            rev = rev * 10;
            long ld = x %10;
            rev += ld;
            x/=10;
        }
        //calculating sum of rev
        long sum =0;
        long ab = rev;
        while(ab>0){
            sum+=ab%10;
            ab/=10;
        }
        return rev * sum;
    }
}