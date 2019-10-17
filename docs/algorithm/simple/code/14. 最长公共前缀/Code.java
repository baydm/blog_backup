import java.util.ArrayList;
import java.util.Arrays;

class Code {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(args));
    }
}

class Solution {
    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        String first = strs[0];
        String dff = "";
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= dff.length() || strs[j].charAt(i) != c) {
                    return dff;
                }
            }
            dff = dff + c;
        }
        return dff;

    }

    public String longestCommonPrefix(String[] strs) {
        // 将数组的第一个字符串，作为前缀，和第二进行比较，找到相同的前缀；再使用该前缀继续和其他字符串进行比较
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) {
                    return "";
                }
            }

        }
        return prefix;
    }

}