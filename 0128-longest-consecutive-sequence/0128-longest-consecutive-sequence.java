// class Solution {
//     public int longestConsecutive(int[] nums) {  /// giving TLE
//         if(nums.length == 0)return 0;
//         HashSet<Integer> set = new HashSet<>();
//         int maxi = 1;
//         for(int el : nums)set.add(el);
//         for(int el : nums){
//             int len = 1;
//             while(set.contains(len + el)){
//                 len++;
//                 maxi = Math.max(maxi, len);
//             }
//         }
//         return maxi;
//     }
// }


import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        HashSet<Integer> set = new HashSet<>();
        int maxi = 1;
        
        // Step 1: Add all elements to the set to eliminate duplicates
        for (int el : nums) {
            set.add(el);
        }
        
        // Step 2: Iterate OVER THE SET, not the array
        for (int el : set) { 
            // Only start building a sequence if 'el' is the absolute start
            if (!set.contains(el - 1)) {
                int len = 1;
                
                // Incrementally look for the next elements
                while (set.contains(el + len)) {
                    len++;
                }
                
                maxi = Math.max(maxi, len);
            }
        }
        
        return maxi;
    }
}

