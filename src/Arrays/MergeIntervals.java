package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        int[] curr_interval = intervals[0];
        List<int[]> out = new ArrayList();
        out.add(curr_interval);

        for(int[] interval:intervals){
            int curr_interval_start = curr_interval[0];
            int curr_interval_end = curr_interval[1];
            int next_interval_start = interval[0];
            int next_interval_end  = interval[1];

            if(curr_interval_end >= next_interval_start){
                curr_interval[1] = Math.max(curr_interval_end , next_interval_end);
            }
            else{
                curr_interval = interval;
                out.add(curr_interval);
            }
        }

        return out.toArray(new int[out.size()][]);
    }
}
