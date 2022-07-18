package 题库;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC496_下一个更大元素I {
    //单调栈
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        int n = nums1.length, m = nums2.length;
        int[] q = new int[nums2.length];
        for (int i = m - 1; i >= 0; i--) {
            while (!stk.isEmpty() && stk.peek() <= nums2[i]) stk.pop();
            if (!stk.isEmpty()) q[i] = stk.peek();
            else q[i] = -1;
            stk.push(nums2[i]);
        }
        // System.out.println(Arrays.toString(q));
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < m; i++) hash.put(nums2[i], i);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = q[hash.get(nums1[i])];
        }
        return res;
    }
}
