class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count =0;
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[1] - b[1] );   ///i forgot to sort accordance to end time means second index
        int lastEnd = intervals[0][1];
        for(int i=1;i<n;i++){
            if(lastEnd > intervals[i][0]){
                count++;  //no need to update lastEnd here as this interval is to be removed so why to take its value
                
            }
            else{
                lastEnd = Math.max(lastEnd, intervals[i][1] );    ///afar ye if condition ke andar likhi so not all test case pass as we need maximum lasEnd
            }
        }
        return count;
    }
}
   