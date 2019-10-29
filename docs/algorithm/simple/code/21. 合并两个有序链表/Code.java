
/**
*/
public class Code {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(4))));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(l1);
        System.out.println(l2);
        ListNode add = (new Solution()).mergeTwoLists(l1, l2);
        System.out.println(add);
    }

}

class Solution {
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode add = new ListNode(0);
        ListNode end = add;
        while (true) {
            if (l1 == null) {
                end.next = l2;
                break;
            }
            if (l2 == null) {
                end.next = l1;
                break;
            }
            if(l1.val <= l2.val){
                end.next = new ListNode(l1.val);
                end = end.next;
                l1 = l1.next;
            }else{
                end.next = new ListNode(l2.val);
                end = end.next;
                l2 = l2.next;
            }
        }
        return add.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val)
        {
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
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