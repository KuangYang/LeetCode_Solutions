/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class myAddTwoNumbers {
    private class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
        }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode p1=l1, p2=l2, curr=ret;
        int sum=0, plus=0;
        while (p1 != null || p2 != null) {
            int val1 = (p1 != null) ? p1.val : 0;
            int val2 = (p2 != null) ? p2.val : 0;
            sum = val1 + val2 + plus;
            plus = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if (plus > 0) {
            curr.next = new ListNode(plus);
        }
        return ret.next;
    }
}
