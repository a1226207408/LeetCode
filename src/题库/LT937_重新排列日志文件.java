package 题库;

import java.util.Arrays;

/**
 * @author CWB
 * @date 2022/5/3
 * @apiNote
 */
public class LT937_重新排列日志文件 {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(s1, s2) -> compare(s1,s2));
        return logs;
    }
    private int compare(String s1, String s2){
        int i1 = s1.indexOf(" ") + 1, i2 = s2.indexOf(" ") + 1;
        char c1 = s1.charAt(i1), c2 = s2.charAt(i2);
        if(Character.isDigit(c1) && Character.isDigit(c2)){
            return 0;
        }else if(Character.isDigit(c1) && !Character.isDigit(c2)){
            return 1;
        }else if(!Character.isDigit(c1) && Character.isDigit(c2)){
            return -1;
        }else{
            String str1 = s1.substring(i1);
            String str2 = s2.substring(i2);
            if(!str1.equals(str2)){
                return str1.compareTo(str2);
            }
            return s1.compareTo(s2);
        }
    }
}
