package 题库;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author CWB
 * @date 2022/5/4
 * @apiNote
 */
public class LC1823_找出游戏的获胜者 {

    //队列模拟
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        while (q.size() > 1) {
            for (int i = 1; i < k; i++) {
                q.offer(q.poll());
            }
            q.poll();
        }
        return q.poll();
    }
}
