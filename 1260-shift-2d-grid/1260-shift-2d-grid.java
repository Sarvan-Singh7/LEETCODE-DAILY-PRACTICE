class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        int m = grid.length, n = grid[0].length;
        k = k%(m*n);
        int total = m * n;
        int arr[] = new int[m*n];
        int index =0;
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
               arr[index++] = grid[i][j];
            }  
        }
        int helper[] = new int[m*n];
        index =0;
        // Copy the "back cut" piece to the front
         for(int i = total - k; i< total; i++){
            helper[index++] = arr[i];
         }
        // Copy the "front remaining" piece to the back
        for(int i= k; i< total; i++){
            helper[index++] = arr[i];
        }
        System.arraycopy(arr, 0, helper, k, total - k);

        index =0;
        for(int i=0; i<m;i++){
            ArrayList<Integer> helper2 = new ArrayList<>();
            for(int j=0; j<n;j++){
               helper2.add(helper[index++]);
            }
            answer.add(helper2);
        }
    
        return answer;
    }
}