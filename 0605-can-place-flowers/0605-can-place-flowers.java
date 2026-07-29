class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // If no flowers need to be placed, it's always true
        if (n <= 0) {
            return true;
        }
        
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            // Check if current plot is empty
            if (flowerbed[i] == 0) {
                // Check if left and right plots are empty or out of bounds
                boolean isLeftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean isRightEmpty = (i == length - 1 || flowerbed[i + 1] == 0);
                
                if (isLeftEmpty && isRightEmpty) {
                    flowerbed[i] = 1; // Plant the flower
                    n--;              // Decrease count
                    
                    if (n == 0) {
                        return true;  // Early exit if all flowers are placed
                    }
                }
            }
        }
        
        return n <= 0;
    }
}
