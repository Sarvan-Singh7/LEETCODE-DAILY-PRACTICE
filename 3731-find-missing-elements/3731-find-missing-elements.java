class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int n = nums.length;
        int mini=Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;

        for(int i=0; i<n;i++){
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }
        
        for(int i = mini; i<= maxi;i++){
            boolean has = false;
            for(int j=0; j<n;j++){
                if(i == nums[j]){
                    has = true;
                    break;
                }
            }
            if(has==false)answer.add(i);
        }
        return answer;
    }
}