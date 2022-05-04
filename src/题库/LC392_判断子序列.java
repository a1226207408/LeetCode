package 题库;

/**
 * @author CWB
 * @date 2022/5/4
 * @apiNote
 */
public class LC392_判断子序列 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0, len1 = s.length(), len2 = t.length();
        while (i < len1 && j < len2) {
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        if(i == len1) return true;
        return false;
    }
}
