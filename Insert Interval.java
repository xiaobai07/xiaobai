/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> res=new ArrayList<Interval>();
        int i=0;
        while(i<intervals.size())
        {
            Interval tmp=intervals.get(i);
            if(tmp.end<newInterval.start){
                res.add(tmp);
            }
            else if(tmp.start>newInterval.end){
                break;
            }
            else{
                newInterval.start=Math.min(tmp.start,newInterval.start);
                newInterval.end=Math.max(tmp.end,newInterval.end);
            }
            i++;
        }
        res.add(newInterval);
        while(i<intervals.size()){
            res.add(intervals.get(i));
            i++;
        }
        return res;
    }
}
