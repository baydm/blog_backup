import java.util.ArrayList;
import java.util.List;

class Code {
    public static void main(String[] args) {
        // System.out.println(isValid(args[0]));
        System.out.println((int) '[');
        System.out.println((int) '{');
        System.out.println((int) '(');
        System.out.println((int) ')');
        System.out.println((int) '}');
        System.out.println((int) ']');
        // System.out.println(isValid("[]"));
        // System.out.println(isValid("({[]})"));
        // System.out.println(isValid("]"));
        // System.out.println(isValid("{[]()}"));
        // System.out.println(isValid("{[]}()[][]({[]})"));
    }

    public static boolean isValid2(String s) {
        List<Character> left = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                left.add(c);
            } else {
                if (left.size() == 0)
                    return false;
                if (c == ']' && left.get(left.size() - 1) != '[')
                    return false;
                if (c == '}' && left.get(left.size() - 1) != '{')
                    return false;
                if (c == ')' && left.get(left.size() - 1) != '(')
                    return false;
                left.remove(left.size() - 1);
            }
        }
        return left.size() == 0;
    }

    public static boolean isValid(String s) {
        char[] cc = new char[s.length() + 1];
        int top = 1;
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                cc[top++] = c;
            } else {
                if (c == ']' && cc[--top] != '[')
                    return false;
                if (c == '}' && cc[--top] != '{')
                    return false;
                if (c == ')' && cc[--top] != '(')
                    return false;
            }
        }
        return top == 1;
    }
}