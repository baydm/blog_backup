
/**
 * 给出两个?`非空` 的链表用 表示两个非负的整
 * 。其中，它们各自的位数是按照?`逆序`?的方式存储的，并且它们的每个节点只能存储 `?一位`?数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 您可以假设除了数字 0 之外，这两个
 * 都不会以 0?开头。 
 * 
 * 示例 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 */
public class Code {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(7))));
        ListNode n2 = new ListNode(9, new ListNode(5, new ListNode(5, new ListNode(7, new ListNode(7)))));
        System.out.println("NodeOne:" + n1.toString());
        System.out.println("NodeTwo:" + n2.toString());
        ListNode sum = addTwoNumbers(n1, n2);
        System.out.println("NodeSum:" + sum.toString());

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 总节点
        ListNode node = new ListNode(0);
        // 是否需要进位
        boolean carry = false;
        // 根节点
        ListNode last = node;
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
                sum -= 10;
            } else {
                carry = false;
            }
            // 添加数据
            last.next = new ListNode(sum);
            // 移动节点
            last = last.next;
        }

        return node.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(val);
        ListNode temp = next;
        while (temp != null) {
            buffer.append(">").append(temp.val);
            temp = temp.next;
        }
        return buffer.toString();
    }
}
