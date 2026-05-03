class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        } 
        PriorityQueue<Integer> q = new PriorityQueue<>( (a,b) -> map.get(a) - map.get(b) );
        ///iterate on map and do ypur work

        for(int key : map.keySet()){
            q.add(key);

            if(q.size() > k)q.poll();
        }
        int answerArray[] = new int[q.size()];
        for(int i=0;i< answerArray.length ; i++){
            answerArray[i] = q.poll();
        }
        return answerArray;

    }
}