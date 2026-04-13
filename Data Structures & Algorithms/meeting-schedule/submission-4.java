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
        Collections.sort(intervals, Comparator.comparingInt(a->a.start));
        if(intervals.size()<=1){
            return true;
        }
        Interval current = intervals.get(0);
        for(int i=1; i<intervals.size(); i++){
            if(current.end>intervals.get(i).start){
                return false;
            }
            else{
                current = intervals.get(i);
            }
        }
        return true;
    }
}
