class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            int target = nums[i];
            for(int j=0;j<n;j++){
                if(target > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}