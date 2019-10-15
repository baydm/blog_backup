
/**
 * 7. 整数反转
 */
public class Code {
    public static void main(String[] args) {
        System.out.println(123);
        System.out.println(new Solution().reverse(123));
        System.out.println(-123);
        System.out.println(new Solution().reverse(-123));
        System.out.println(120);
        System.out.println(new Solution().reverse(120));
        System.out.println(1534236469);
        System.out.println(new Solution().reverse(1534236469));
        System.out.println(2147447412);
        System.out.println(new Solution().reverse(2147447412));
        System.out.println(new Solution().reverse2(2147447412));

    }
}

class Solution {
    public int reverse2(int x) {
        if (x > -10 && x < 10) {
            return x;
        }
        int rev = 0;
        while (x != 0) {
          int pop = x % 10;
          x = x / 10;
          if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
          if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
          rev = rev * 10 + pop;
        }
        return rev;
    }
    public int reverse(int x) {
        if (x > -10 && x < 10) {
            return x;
        }
        long subFlag = x < 0 ? -1l : 1l;
        StringBuffer buffer = new StringBuffer().append(x * subFlag);
        long y = Long.valueOf(buffer.reverse().toString()) * subFlag;
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
            return 0;
        return (int) (y);
    }
}
