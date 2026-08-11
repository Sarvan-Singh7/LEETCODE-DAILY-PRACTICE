class Solution {
    public int missingInteger(int[] nums) {
        int maxi = nums[0];
        int count =0;
        int n = nums.length;

        if(n==1)return nums[0] + 1;

        int sum =nums[0];
        int totalSum =nums[0];//to iterate as in worst case all consecutive so to check which missing after inclusive maxSum of all consecutive
        for(int i=1; i<n;i++){  
            totalSum+= nums[i];
            if( nums[i- 1] + 1 == nums[i] ){
                count++;
                sum += nums[i];
                maxi = Math.max(maxi, sum);
                
            }
            else{
                break; //as longest Integer shall start from 0th index s break here

            }
            
        }
        System.out.println(maxi);
       
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)set.add(num);
        
        while(set.contains(maxi)){
            maxi = maxi+1;
        }
        return maxi;
    }
}