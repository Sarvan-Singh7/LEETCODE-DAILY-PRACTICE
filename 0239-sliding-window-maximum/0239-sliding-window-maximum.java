// class Solution {  THIS IS MY ANSWER CODE AT UCA CODING PART
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int[] answer = new int[nums.length - k +1];
//         Queue<Integer> q = new LinkedList<>();
//         for(int i=0; i<k;i++){
//             q.add(nums[i]);
//         }
//         int j=0;
//         int maxi = Integer.MIN_VALUE;
//         for(int i=k;i<nums.length;i++){
//             Queue<Integer> q2 = new LinkedList<>();
//             maxi = Integer.MIN_VALUE;
//             while(!q.isEmpty()){
//                 int val = q.poll();
//                 maxi = Math.max(maxi,val );
//                 q2.add(val);
//             }
//             while(!q2.isEmpty()){
//                 q.add(q2.poll());
//             }
//             answer[j++] = maxi;
//             q.poll();
//             q.add(nums[i]);

//         }
//         maxi = Integer.MIN_VALUE;//////i did not reset maxi after this in paper
//         while(!q.isEmpty()){
//             int val = q.poll();
//             maxi = Math.max(val, maxi);
//         }
//         answer[j] = maxi;
//         return answer;
//     }
// }

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int j=0;
        int[] answer = new int[nums.length - k +1];
        for(int i=0;i<nums.length;i++){
            //maintaining monotonic decreasing Order
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[i] ){
                dq.removeLast();
            }
            dq.addLast(i);    ///agar ye line niche likhi  so error as getFirst se pehel kuch hona bhi chahiye
            ///if sixe of window exceeds k
            if(dq.getFirst() + k == i){
                dq.removeFirst();
            }
            if(i >= k-1){
                answer[j++] = nums[dq.getFirst()];
            }
            
        }
        return answer;
    }
}