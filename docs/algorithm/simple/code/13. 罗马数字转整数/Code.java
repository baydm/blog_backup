import java.util.HashMap;
import java.util.Map;

/**
 */
class Code {
    public static void main(String[] args) {

        print(romanToInt("III"));
        print(romanToInt("IV"));
        print(romanToInt("IX"));
        print(romanToInt("LVIII"));
        print(romanToInt("MCMXCIV"));
    }

    public static void print(Object object) {
        System.out.println(object);
    }

    public static int romanToInt(String s) {
        Map<String, Integer> rInt = new HashMap<>();
        rInt.put("I", 1);
        rInt.put("IV", 4);
        rInt.put("V", 5);
        rInt.put("IX", 9);
        rInt.put("X", 10);
        rInt.put("XL", 40);
        rInt.put("L", 50);
        rInt.put("XC", 90);
        rInt.put("C", 100);
        rInt.put("CD", 400);
        rInt.put("D", 500);
        rInt.put("CM", 900);
        rInt.put("M", 1000);
        int sum = 0;
        int length = s.length();
        String str;
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                str = s.substring(i, i + 2);
                if (rInt.containsKey(str)) {
                    sum += rInt.get(str);
                    i++;
                } else {
                    str = s.substring(i, i + 1);
                    sum += rInt.get(str);
                }
            } else {
                str = s.substring(i, i + 1);
                sum += rInt.get(str);
            }
        }
        return sum;
    }
}