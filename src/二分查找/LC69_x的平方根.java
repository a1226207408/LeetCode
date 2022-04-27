package 二分查找;

/**
 * @author CWB
 * @date 2022/4/28
 * @apiNote
 */
public class LC69_x的平方根 {
    public int mySqrt(int x) {
        long l = 0,r = x;
        while(l < r){
            long mid = l + r + 1 >> 1;
            if(mid * mid <= x) l = mid;
            else r = mid - 1;
        }
        return (int)l;
    }
}
