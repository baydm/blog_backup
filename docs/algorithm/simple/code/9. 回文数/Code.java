import java.util.ArrayList;
import java.util.List;

/**
 * 9. ������
 */
class Code {
    public static void main(String[] args) {
        // System.out.println(isPalindrome2(2));
        // System.out.println(isPalindrome2(121));
        // System.out.println(isPalindrome2(12321));
        System.out.println(isPalindrome4(2147483647));
        System.out.println(isPalindrome4(-1));
        System.out.println(isPalindrome4(0));
        System.out.println(isPalindrome4(1));
        System.out.println(isPalindrome4(11));
        System.out.println(isPalindrome4(12));
        System.out.println(isPalindrome4(121));
        System.out.println(isPalindrome4(1221));
        System.out.println(isPalindrome4(12321));
        System.out.println(isPalindrome4(123321));
        System.out.println(isPalindrome4(1231321));
    }

    public static boolean isPalindrome4(int x) {
        System.out.print(x + ": ");
        if (x < 0)
            return false;
        if (x < 10)
            return true;
        if (x % 10 == 0)
            return false;
        int size = 10;
        if (x <= 99) {
            size = 10;
        } else if (x <= 999) {
            size = 100;
        } else if (x <= 9999) {
            size = 1000;
        } else if (x <= 99999) {
            size = 10000;
        } else if (x <= 999999) {
            size = 100000;
        } else if (x <= 9999999) {
            size = 1000000;
        } else if (x <= 99999999) {
            size = 10000000;
        } else if (x <= 999999999) {
            size = 100000000;
        } else if (x <= 2147483647) {
            size = 1000000000;
        }
        while (size > 9) {
            int e = x % 10;
            int h = x / size;
            if (h != e)
                return false;
            x = x / 10;
            x = x % (size / 10);
            size /= 100;
        }
        return true;
    }

    public static boolean isPalindrome3(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int y = x;
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            System.out.println(result);
            x = x / 10;
        }
        return result == y;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;
        if (x % 10 == 0)
            return false;
        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return x == y || x == y / 10;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;
        List<Integer> num = new ArrayList<>();
        int size = 0;
        while (x > 0) {
            num.add(x % 10);
            x = x / 10;
            size++;
        }

        for (int i = 0; i < size / 2; i++) {
            if (num.get(i) != num.get(size - 1 - i))
                return false;
        }

        return true;
    }
}
