/// 2.两数相加
/// 给出两个 `非空` 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 `逆序` 的方式存储的，并且它们的每个节点只能存储 ` 一位` 数字。
/// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
/// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
///
/// 示例
/// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
/// 输出：7 -> 0 -> 8
/// 原因：342 + 465 = 807
main() {
  ListNode n1 = ListNode(2,ListNode(4,ListNode(3)));
  print("NodeOne:$n1");
  ListNode n2 = ListNode(5,ListNode(6,ListNode(4)));
  print("NodeTwo:$n2");
  ListNode sum = addTwoNumbers(n1, n2);
  print("NodeSum:$sum");
}

ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode sumNode = ListNode(0);
    bool carry = false;
    ListNode lastNode = sumNode;
    while (l1 != null || l2 != null || carry) {
      int sum = carry ? 1 : 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      if (sum > 9) {
        carry = true;
        sum = sum - 10;
      } else {
        carry = false;
      }

      lastNode.next = ListNode(sum);
      lastNode = lastNode.next;
    }
    return sumNode.next;
  }

class ListNode {
  int val;
  ListNode next;

  ListNode([this.val, this.next]);

  @override
  String toString() {
    StringBuffer buffer = StringBuffer(val);
    ListNode next = this.next;
    while (next != null) {
      buffer..write(">")..write(next.val);
      next = next.next;
    }
    return buffer.toString();
  }
}
