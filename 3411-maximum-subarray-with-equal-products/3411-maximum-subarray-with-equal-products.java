class Solution {
    private int gcd(int num1, int num2){
        while(num2 != 0){
            int temp = num1;
            num1 = num2;
            num2 = temp%num2;
        }
        return num1;
    }
    public int maxLength(int[] nums) {
        int prod = 1;
        int n = nums.length;
        int maxLen = 0;
        for(int i=0; i<n;i++){
            
            for(int j=i; j<n;j++){
                prod =1;
                int hcf = nums[i];
                int lcm = nums[i];
                for(int k=i; k<=j;k++){
                    prod = prod * nums[k];
                    hcf = gcd(hcf, nums[k]);
                    lcm = (lcm / gcd(lcm, nums[k])) * nums[k]; // Proper LCM update

                }
                
                if(prod == lcm * hcf)maxLen = Math.max(maxLen, j-i+1);

            }
            
        }
        return maxLen;
    }
}