/// 20. 有效的括号
main() {
  print(isValid("{{}}[()(())]"));
}

bool isValid2(String s) {
  List<String> left = [];
  for (int i = 0; i < s.length; i++) {
    String c = s.substring(i, i + 1);
    if (c == '[' || c == '{' || c == '(') {
      left.add(c);
    } else {
      if (left.length == 0) return false;
      if (c == ']' && left[left.length - 1] != '[') return false;
      if (c == '}' && left[left.length - 1] != '{') return false;
      if (c == ')' && left[left.length - 1] != '(') return false;
      left.removeAt(left.length - 1);
    }
  }
  return left.length == 0;
}

bool isValid(String s) {
  List<String> stack = ['1'];
  int top = 1;
  for (int i = 0; i < s.length; i++) {
    String c = s.substring(i, i + 1);
    print("$c , stack : $stack");
    if (c == '(' || c == '{' || c == '[') {
      stack.add(c);
      top ++;
    } else if (c == ')' && stack[--top] != '(') {
      return false;
    } else if (c == '}' && stack[--top] != '{') {
      return false;
    } else if (c == ']' && stack[--top] != '[') {
      return false;
    }
  }
  return top == 1;
}
