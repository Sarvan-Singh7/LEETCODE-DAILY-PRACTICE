class Solution {
    public int mostFrequentEven(int[] nums) {
        int answer = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] %2 ==0)
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int maxFreq =0;
        for(int key : map.keySet()){
            if(map.get(key)> maxFreq){
                maxFreq = map.get(key);
                answer = key;
            }
            if(maxFreq == map.get(key) && answer > key){
                answer = key;
            }
        }
        return answer;
    }
}