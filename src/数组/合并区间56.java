package 数组;

import java.util.*;

public class 合并区间56 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return new int[0][];
        }

        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < intervals.length; i++) {
            if (i + 1 < intervals.length && intervals[i + 1][0] <= intervals[i][1]) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = Math.max(intervals[i + 1][1], intervals[i][1]);
            } else {
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[0][]);

    }
}
