import java.util.Arrays;

class Solution {
    public static int hcf(int a, int b) {
        if (b == 0) return a;
        return hcf(b, a % b);
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int mx = 0;
        
        // Step 1: Construct the prefixGcd array
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            prefixGcd[i] = hcf(nums[i], mx);
        }
        
        // Step 2: Sort the prefixGcd array
        Arrays.sort(prefixGcd);
        
        // Step 3: Pair the smallest and largest elements
        long sum = 0;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            sum += hcf(prefixGcd[i], prefixGcd[j]);
            i++;
            j--;
        }
        
        return sum;
    }
}