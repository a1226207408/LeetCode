package 二分查找;

public class 剑指OfferII072求平方根 {
    public int mySqrt(int x) {
        int start = 0, end = x;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if ((long)mid * mid <= x) {
                start = mid + 1;
                res = mid;
            } else {
                end = mid -1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        剑指OfferII072求平方根 s = new 剑指OfferII072求平方根();
        long start = System.currentTimeMillis();
        System.out.println(s.mySqrt(4));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
