class Solution {
    public int longestBalanced(int[] nums) {
        int maxii = 0;
        for(int i=0;i<nums.length;i++){
            int evenCount=0,oddCount=0;
            HashSet<Integer> set= new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(!set.contains(nums[j])){
                    set.add(nums[j]);
                if(nums[j]%2 ==0)evenCount++;
                if(nums[j]%2 !=0)oddCount++;
                }
                
                if(evenCount == oddCount && evenCount >0){
                    maxii = Math.max(maxii, j-i+1);
                }
            }
        }
        return maxii;
    }
}