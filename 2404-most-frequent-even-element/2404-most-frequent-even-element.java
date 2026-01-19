class Solution {
    public int mostFrequentEven(int[] nums) {
        int answer = -1;      // used to get key of maximum frequency element
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] %2 ==0)                                 // so that i stored only for even elements
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int maxFreq =0;     // always used to get maximum frequency
        for(int key : map.keySet()){
            if(map.get(key)> maxFreq){
                maxFreq = map.get(key);
                answer = key;
            }
            if(maxFreq == map.get(key) && answer > key){   // used to handle if smaller element then current is having same frequency
                answer = key;
            }
        }
        return answer;
    }
}