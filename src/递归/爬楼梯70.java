package 递归;

import java.util.HashMap;

public class 爬楼梯70 {
    private HashMap<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if (map.containsKey(n)){
            return map.get(n);
        }
        int ret = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n,ret);
        return ret;
    }

    public static void main(String[] args) {
        爬楼梯70 s = new 爬楼梯70();
        System.out.println(s.climbStairs(45));
    }
}
