package 树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CWB
 * @date 2022/4/21
 * @apiNote
 */
public class 二叉搜索树中的众数501 {
    int maxCount, curCount, lastVal;
    List<Integer> res = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (root.val == lastVal) {
            curCount++;
        } else {
            curCount = 1;
        }
        lastVal = root.val;
        if (curCount > maxCount) {
            maxCount = curCount;
            res = new ArrayList<>();
            res.add(root.val);
        } else if (curCount == maxCount) {
            res.add(root.val);
        }
        dfs(root.right);
    }
}
