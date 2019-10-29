/// 21. 合并两个有序链表
main() {
  ListNode l1 = ListNode(1, ListNode(1, ListNode(4, ListNode(5))));
  ListNode l2 = ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6)))));
  print(l1.toString());
  print(l2.toString());
  ListNode add = Solution().mergeTwoLists(l1, l2);
  print(add.toString());
}

class Solution {
  ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    ListNode addNode = ListNode(0);
    ListNode end = addNode;
    while (true) {
      if (l1 == null) {
        end.next = l2;
        break;
      }
      if (l2 == null) {
        end.next = l1;
        break;
      }
      if (l1.val <= l2.val) {
        end.next = ListNode(l1.val);
        end = end.next;
        l1 = l1.next;
      } else {
        end.next = ListNode(l2.val);
        end = end.next;
        l2 = l2.next;
      }
    }
    return addNode.next;
  }

  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    if (l1.val < l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }
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
