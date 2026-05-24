class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num : nums){
            q.add(num);
        }
        int i=0;
        while(!q.isEmpty()){
            nums[i++] = q.poll();
        }
        return nums;
    }
}