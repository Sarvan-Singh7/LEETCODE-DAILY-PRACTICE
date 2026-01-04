class Solution {
    public int result(int n){
        int count=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i ==0){
                count++;   //calculate sum ans count both
                sum+=i;
            }
            if(count>4)break;    // condition by which it got accepted as because to not calculate when count increased by threshold
        }
        if(count==4){
            return sum;
        }
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=result(nums[i]);
        }
        return sum;
    }
}