import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        // Step 1: Count the frequency of each character
        int[] counts = new int[26];
        for (char c : word.toCharArray()) {
            counts[c - 'a']++;
        }
        
        // Step 2: Sort frequencies in ascending order
        Arrays.sort(counts);
        
        int totalPushes = 0;
        
        // Step 3: Iterate backwards (from highest frequency to lowest)
        for (int i = 25; i >= 0; i--) {
            if (counts[i] == 0) break; // Stop if no more characters
            
            // 25 - i gives the rank (0 to 25)
            int rank = 25 - i;
            int pushesNeeded = (rank / 8) + 1;
            totalPushes += counts[i] * pushesNeeded;
        }
        
        return totalPushes;
    }
}
