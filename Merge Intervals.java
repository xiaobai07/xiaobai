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
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Collections.sort(intervals, new Comparator<Interval>()
        {
            public int compare(Interval a, Interval b)
            {
                return new Integer(a.start).compareTo(new Integer(b.start));            
            }
            
        });
        ArrayList<Interval> res=new ArrayList<Interval>();
        if(intervals.size()==0) return res;
        Interval first=new Interval(intervals.get(0).start,intervals.get(0).end);
        if(intervals.size()==1)  
        {
            res.add(first);  
            return res;        
        }
        int i=1;
        while(i<intervals.size())
        {
            if(intervals.get(i).start>first.end)
            {
                res.add(first);
                first=intervals.get(i);
            }
            else if(intervals.get(i).end>first.end)
            {
                first.end=intervals.get(i).end;
            }
            i++;
          
        }
        res.add(first);
        return res;
    }
}
