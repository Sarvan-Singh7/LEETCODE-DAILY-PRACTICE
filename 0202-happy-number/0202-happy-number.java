class Solution {
    public boolean isHappy(int n) {
        
        int count = 800000; /// as given integer ka size 8 se bada nahin ho sakta
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