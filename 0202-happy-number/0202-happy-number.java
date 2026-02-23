class Solution {
    public boolean isHappy(int n) {
        
        int count = 10;
        while(count-- > 0){int sum =0;
        while(n>0){
            int item = n % 10;
            sum += (item * item);
            n/=10;
        }
        if(sum ==1)return true;
        n = sum;
    }
    return false;
    }
}