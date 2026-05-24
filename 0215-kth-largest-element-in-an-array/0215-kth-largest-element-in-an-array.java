class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num : nums){
            q.add(num);
            if(q.size() > k){
                q.remove();
            }
        }
        return q.remove();

    }
}