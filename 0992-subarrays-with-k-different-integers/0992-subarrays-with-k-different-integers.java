// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {
        
//         int count =0;
//         for(int i=0;i<nums.length;i++){
//             int SubArrayCount =0;HashSet<Integer> set = new HashSet<>();
//             for(int j=i;j<nums.length;j++){
//                 set.add(nums[j]);
//                 if(set.size() == k){
//                     count++;
//                 }
                
//             }
//         }
//         return count;
//     }
// }

// WE HAVE TO FIND NUMBERS OF DIFFERENT INTEGERS IN THAT ARRAY WHOSE COUNT EQUALS K
// SO DO CALCULATE FOR [NUMBER OF INTEGERS SIZE <= K ] - [NUMBER OF INTEGERS SIZE <= K-1] SO ANSWER == [INTEGERS EQUAL K]
class Solution {
    //function calculate less than equals k
    public static int Check(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        int left =0;
        for(int right =0;right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) +1);
            while(map.size() > k){
                map.put(nums[left], map.get(nums[left]) -1);
                if(map.get(nums[left]) == 0)map.remove(nums[left]);
                left++;
            }
            count = count + (right - left +1);
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
    //check we calculate for gte k - gte k-1 so resultant is equalt to k wale
        int answer = Check(nums, k) - Check(nums, k-1);
        return answer;
    }
}
              
      
      
                  