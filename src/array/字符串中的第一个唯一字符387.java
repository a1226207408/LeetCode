package array;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class 字符串中的第一个唯一字符387 {

    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }
        for(int i = 0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            if(arr[index] == 1){
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test(){
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
