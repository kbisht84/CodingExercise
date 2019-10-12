package LinkList;
/*
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807
 */

import java.util.LinkedList;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l3 = new ListNode(0);
        while (l1.next != null || l2.next != null) {
            int sum = carry + l1.val + l2.val;
            if(sum >= 10) {
                carry = 1;
                sum = sum %10;
            }
            l3.next.val = sum;
            l1 = l1.next;
            l2 = l2.next;


        }
        return l3;
    }




}
