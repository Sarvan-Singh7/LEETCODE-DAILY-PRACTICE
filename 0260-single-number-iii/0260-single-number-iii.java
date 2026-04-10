class Solution {
    public int[] singleNumber(int[] nums) {
        ///step 1 = XOR all
        int n =0; //as 0 xor something = something
        for(int i=0;i<nums.length;i++){
            n ^= nums[i];
        }
        int mask = (n & (n-1))^n;  //gies us mask in which only right most set bit in n is set , all other not.
        
        //step2 = finding that 2 numbers in xor1 and xor2
        int xor1=0,xor2=0;
        for(int i=0;i<nums.length;i++){
            int number = nums[i] & mask;
            if(number ==0){
                xor1 = xor1 ^ nums[i];
            }
            else{
                xor2 = xor2 ^ nums[i];
            }
        }
        int arr[] = {xor1, xor2};
        return arr;

    }
}
//as when we get n then we know that n is xor of two single element so that if we get set bit rightmost in mask then it is sure that Set bit is formed by one set and another non set in n so just make it & ans see result on dry run