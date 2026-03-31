class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int result=0;
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int[] current = intervals[0];
        for(int i=1; i<intervals.length; i++){
            if(current[1]>intervals[i][0]){
                result++;
                if(intervals[i][1]<current[1]){
                    current = intervals[i];
                }
            }
            else{
                current = intervals[i];
            }
        }
        return result;
    }
}
