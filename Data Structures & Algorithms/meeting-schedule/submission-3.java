/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()<=1){
            return true;
        }
        Collections.sort(intervals, Comparator.comparingInt(a->a.start));
        Interval current = intervals.get(0);
        for(int i=1; i<intervals.size(); i++){
            if(current.end>intervals.get(i).start){
                return false;
            }
            current = intervals.get(i);
        }
        return true;
    }
}
