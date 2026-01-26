class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList<>();
        int minimumGap = Integer.MAX_VALUE;     // isko maine -1 liya tha pehle so empty answer de raha tha
        for(int i = 1;i<arr.length;i++){   // finded minimum difference what should be
            int gap = Math.abs(arr[i] - arr[i-1]);
            minimumGap = Math.min(minimumGap, gap);
        }
        for(int i=1;i<arr.length;i++){         // append those two elements via arraylist helper to arraylist answer;
            if(arr[i] - arr[i-1] == minimumGap){
                List<Integer> helper = new ArrayList<>();
                helper.add(arr[i-1]);
                helper.add(arr[i]);
                answer.add(helper);
            }
            
        }
        return answer;
    }
}