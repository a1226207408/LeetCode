package 题库;

import java.util.ArrayList;
import java.util.List;

public class LC22_括号生成 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n, 0, 0, "");
        return res;
    }
    void dfs(int n, int lc, int rc, String s) {
        if (lc == n && rc == n) res.add(s);
        else {
            if (lc < n) dfs(n, lc + 1, rc, s + "(");
            if (rc < n && lc > rc) dfs(n, lc, rc + 1, s + ")");
        }
    }
}
