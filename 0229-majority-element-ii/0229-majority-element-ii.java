class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
             if(map.get(nums[i]) >n/3){
                if(!arr.contains(nums[i])){
                    arr.add(nums[i]);
                }
                
            }
        }
        for(int key : map.keySet()){
           
        }
        return arr;
    }
}