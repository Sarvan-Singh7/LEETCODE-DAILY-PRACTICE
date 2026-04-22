class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        int n = intervals.length;
        List<int []> arr = new ArrayList<>();
        while(i<n && intervals[i][1] < newInterval[0]){
            arr.add(intervals[i]);   //add existing one which are not part of new interval
            i++;
        }
        while(i<n && intervals[i][0] <= newInterval[1]){  //if overlapping part came between two so choose minimum as newInterval first index
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        arr.add(new int[]{newInterval[0], newInterval[1]});

        while(i<n){                     ///if any left so just simply add it
            arr.add(intervals[i]);
            i++;
        }

        return arr.toArray(new int[arr.size()][]);
    }
}


//in Conclusion = Problem divided into 3 parts === 1. find intervals which are not part of overlapping part
//                                                 2. find minimum and maximum from intervals part of overlapping and insert after loop
//                                                 3. just insert remaining element if exists