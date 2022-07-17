package 周赛;


import org.junit.jupiter.api.Test;

import java.util.*;

public class LC6121_裁剪数字后查询第K小的数字 {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] qs) {
        int n = nums.length, m = qs.length;
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pair p = new Pair();
            p.str = nums[i];
            p.index = i;
            pairs.add(p);
        }
        int[] res = new int[m];
        int i = 0;
        for (int[] q : qs) {
            int k = q[0], trim = q[1];
            pairs.sort((Pair p1, Pair p2) -> {
                for (int j = p1.str.length() - trim; j < p1.str.length(); j++) {
                    if (p1.str.charAt(j) > p2.str.charAt(j)) return 1;
                    else if (p1.str.charAt(j) < p2.str.charAt(j)) return -1;
                }
                return p1.index - p2.index;
            });
            res[i++] = pairs.get(k - 1).index;
        }
        return res;
    }

    @Test
    public void test() {
        String[] nums = {"102","473","251","814"};
        int[][] q = {{1, 1}, {2, 3}, {4,2},{1,2}};
        System.out.println(Arrays.toString(smallestTrimmedNumbers(nums, q)));
    }

    @Test
    public void testQueue() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.poll());
    }
}
class Pair{
    String str;
    int index;
}
