class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int answer =1;
        for(int i=1;i<n;i++){
            if(arr[i] >=answer +1){
                answer++;
            }
        }
        return answer;
    }
}