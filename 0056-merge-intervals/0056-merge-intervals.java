class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> answer = new ArrayList<>();
        Arrays.sort(intervals  , (a, b) -> a[0] - b[0]);//lambda expression -> as like Arraow Function in JS
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }else{
                answer.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        answer.add(new int[]{start, end});
        int arr[][] = new int[answer.size()][2];
        for(int i=0;i<answer.size();i++){
            for(int j=0;j<2;j++){
                arr[i][j] = answer.get(i)[j];
            }
        }
        return arr;
    }
}