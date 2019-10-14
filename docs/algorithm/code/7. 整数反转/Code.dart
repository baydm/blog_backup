import 'dart:math';

/// 7. 整数反转
/// 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
/// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

final num MAX_VALUE = pow(2, 31) - 1;
final num MIN_VALUE = -pow(2, 31);
main() {
  print(MAX_VALUE);
  print(MIN_VALUE);
  // print(123);
  // print(reverse2(123));
  // print(-123);
  // print(reverse2(-123));
  // print(120);
  // print(reverse2(-120));
  // print(2147483647);
  // print(reverse2(7463847412));
}

int reverse2(int x) {
  int rev = 0;
  while (x != 0) {
    int pop = x % 10;
    x = (x ~/ 10).toInt();
    if (rev > MAX_VALUE / 10 || (rev == MAX_VALUE / 10 && pop > 7)) return 0;
    if (rev < MIN_VALUE / 10 || (rev == MIN_VALUE / 10 && pop < -8)) return 0;
    rev = rev * 10 + pop;
  }
  return rev;
}

int reverse(int x) {
  if (x > -10 && x < 10) {
    return x;
  }
  num subFlag = x < 0 ? -1 : 1;
  String str = (x * subFlag).toString();
  int length = str.length;
  StringBuffer buffer = new StringBuffer();
  while (length > 0) {
    buffer.write(str.substring(length - 1, length));
    length--;
  }

  num y = num.parse(buffer.toString()) * subFlag;
  if (y > MAX_VALUE || y < MIN_VALUE) return 0;
  return y.toInt();
}
