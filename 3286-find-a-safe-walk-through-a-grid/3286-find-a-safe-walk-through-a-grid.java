import java.util.*;

class Solution {
    public boolean f(List<List<Integer>> grid, int health, int m, int n, int[][] memo) {
        // 1. Boundary Checks
        if (m < 0 || n < 0 || m >= grid.size() || n >= grid.get(0).size()) {
            return false;
        }

        // 2. Subtract health for entering the current cell
        health = health - grid.get(m).get(n);
        if (health <= 0) return false;

        // 3. Base Case: Reached the start cell safely
        if (m == 0 && n == 0) {
            return true;
        }

        // 4. Pruning & Memoization Check:
        // If we have already visited this cell with a health greater than or equal 
        // to our current health, this path is sub-optimal. Return false.
        if (memo[m][n] >= health) {
            return false;
        }
        
        // Record the highest health we've managed to bring to this cell so far
        memo[m][n] = health;

        // 5. Explore all 4 directions
        boolean up = f(grid, health, m - 1, n, memo);
        boolean down = f(grid, health, m + 1, n, memo);
        boolean left = f(grid, health, m, n - 1, memo);
        boolean right = f(grid, health, m, n + 1, memo);

        return up || down || left || right;
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int rows = grid.size();
        int cols = grid.get(0).size();
        
        // memo[r][c] will store the MAXIMUM health seen at cell (r, c) so far.
        // Initialize everything to -1.
        int[][] memo = new int[rows][cols];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        // Start from the bottom-right corner and work backwards to (0,0)
        return f(grid, health, rows - 1, cols - 1, memo);
    }
}