package 题库;

/**
 * @author CWB
 * @date 2022/5/7
 * @apiNote
 */
public class LC12_整数转罗马数字 {
    public String intToRoman(int num) {
        int[] nums = {
                1, 4, 5, 9,
                10, 40, 50, 90,
                100, 400, 500, 900,
                1000
        };

        String[] s = {
                "I", "IV", "V", "IX",
                "X", "XL", "L", "XC",
                "C", "CD", "D", "CM",
                "M"
        };
        String res = "";
        for (int i = 12; i >= 0; i--) {
            while (num >= nums[i]) {
                num -= nums[i];
                res += s[i];
            }
        }
        return res;
    }
}
