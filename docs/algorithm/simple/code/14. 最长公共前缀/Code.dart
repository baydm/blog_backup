/// 14. 最长公共前缀
main() {
  print(longestCommonPrefix(['qw', 'qwe', 'qwer']));
}

String longestCommonPrefix2(List<String> strs) {
  if (strs.length == 0) return "";
  if (strs.length == 1) return strs[0];
  String first = strs[0];
  String dff = "";
  for (int i = 0; i < first.length; i++) {
    String c = first.substring(i, i + 1);
    for (int j = 1; j < strs.length; j++) {
      if (strs[j].length <= dff.length || strs[j].substring(i, i + 1) != c) {
        return dff;
      }
    }
    dff = dff + c;
  }
  return dff;
}

String longestCommonPrefix(List<String> strs) {
    if (strs == null || strs.length == 0)
        return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1);
            if (prefix.length == 0) {
                return "";
            }
        }

    }
    return prefix;
}