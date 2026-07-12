class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        
        int helper[] = new int[n];
        if(n==0)return helper;
        for(int i=0;i<n;i++){
            helper[i] = arr[i];
        }
        Arrays.sort(helper);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=1;
        map.put(helper[0], 1);
        for(int i=1;i<n;i++){
            if(helper[i] > helper[i-1]){
                count++;
            }
            map.put(helper[i], count);

        }
        for(int i=0;i<n;i++){
            int val = map.get(arr[i]);
            helper[i] = val;
        }
        return helper;
    }
}