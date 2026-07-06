class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        ////see how to do sorting of 2 types in one lambda function
        Arrays.sort(intervals, (a, b) -> {
            if(a[0] == b[0])return b[1] - a[1]; ///agar starting time same hai toh sort in descending order to get correct out put on test case = [[1,2],[1,4],[3,4]]
            else return a[0] - b[0];   //// sort in ascending order simply accoring to start time
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        int count =0;

        for(int i = 1; i<intervals.length;i++){
            if(end >= intervals[i][0] && end >= intervals[i][1]){
                count++;
                
            }
            else{
                end = intervals[i][1];
                start = intervals[i][0];
            }
        }
        return intervals.length - count;
    }
}