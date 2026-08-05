import java.util.*;

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        
        // STEP 1: Graph Setup (0-based indexing)
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Edge banao (Directed graph - sirf ek direction mein)
        for (int[] edge : invocations) {
            int u = edge[0]; // Kon call kar raha hai
            int v = edge[1]; // Kisko call kar raha hai
            graph.get(u).add(v); 
        }

        // STEP 2: BFS (Find infected apps)
        boolean[] infected = new boolean[n]; // Tumhara visited array
        Queue<Integer> q = new LinkedList<>();

        infected[k] = true;
        q.add(k);

        while (!q.isEmpty()) {
            int current = q.poll();
            for (int neighbor : graph.get(current)) {
                if (infected[neighbor] == false) {
                    q.add(neighbor);
                    infected[neighbor] = true;
                }
            }
        }

        // STEP 3: Twist check (Kya koi safe app infected app ko bula rahi hai?)
        boolean canRemove = true;
        
        for (int[] edge : invocations) {
            int u = edge[0]; // Source
            int v = edge[1]; // Destination
            
            // Agar Source safe hai aur Destination infected hai
            if (infected[u] == false && infected[v] == true) {
                canRemove = false; // Hum delete nahi kar sakte!
                break; // Aage check karne ki zaroorat nahi
            }
        }

        // STEP 4: Answer array banao
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (canRemove == true) {
                // Agar delete kar sakte hain, toh sirf SAFE apps dalo
                if (infected[i] == false) {
                    ans.add(i);
                }
            } else {
                // Agar delete NAHI kar sakte, toh SAARI apps dalo
                ans.add(i);
            }
        }

        return ans;
    }
}