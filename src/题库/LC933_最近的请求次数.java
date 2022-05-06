package 题库;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author CWB
 * @date 2022/5/6
 * @apiNote
 */
public class LC933_最近的请求次数 {
    class RecentCounter {

        Queue<Integer> q;

        public RecentCounter() {
            q = new LinkedList<>();
        }

        public int ping(int t) {
            q.offer(t);
            while (q.peek() + 3000 < t) q.poll();
            return q.size();
        }
    }
}
