import 'dart:math';

/// 9. 回文数
/// 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
main() {
  print(isPalindrome(pow(2, 31) - 1));
  print(isPalindrome(100));
  print(isPalindrome(-1));
  print(isPalindrome(0));
  print(isPalindrome(1));
  print(isPalindrome(11));
  print(isPalindrome(12));
  print(isPalindrome(121));
  print(isPalindrome(1221));
  print(isPalindrome(12321));
  print(isPalindrome(123321));
  print(isPalindrome(12344321));
  print(isPalindrome(123454321));
}

bool isPalindrome2(int x) {
  if (x < 0) return false;
  if (x < 10) return true;
  if (x % 10 == 0) return false;

  int y = 0;
  while (x > y) {
    y = y * 10 + x % 10;
    x = x ~/ 10;
  }
  return x == y || x == y ~/ 10;
}

bool isPalindrome(int x) {
  if (x < 0) return false;
  if (x < 10) return true;
  List<int> num = [];

  while (x > 0) {
    num.add(x % 10);
    x = x ~/ 10;
  }

  for (var i = 0; i < num.length ~/ 2; i++) {
    if (num[i] != num[num.length - 1 - i]) return false;
  }

  return true;
}
