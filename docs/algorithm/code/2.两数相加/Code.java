
/**
 * ��������?`�ǿ�` �������� ��ʾ�����Ǹ�����
 * �����У����Ǹ��Ե�λ���ǰ���?`����`?�ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 `?һλ`?���֡�
 * ��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡� �����Լ���������� 0 ֮�⣬������
 * �������� 0?��ͷ�� 
 * 
 * ʾ�� ���룺(2 -> 4 -> 3) + (5 -> 6 -> 4) �����7 -> 0 -> 8 ԭ��342 + 465 = 807
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

        // �ܽڵ�
        ListNode node = new ListNode(0);
        // �Ƿ���Ҫ��λ
        boolean carry = false;
        // ���ڵ�
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
            // �������
            last.next = new ListNode(sum);
            // �ƶ��ڵ�
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
