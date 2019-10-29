package LinkList;
/*
Input: (6 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807
 */

import java.util.LinkedList;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy_node =new ListNode(0);
        ListNode l3 = dummy_node;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val:0;
            int y = (l2 != null)  ? l2.val:0;
            int sum = carry + x + y;
            int last_digit = sum %10;
            carry = sum/10 ;
            l3.next = new ListNode(last_digit);
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
            l3 = l3.next;
        }
        if(carry > 0) {
            ListNode new_node = new ListNode(carry);
            l3.next = new_node;
        }
        return dummy_node.next;
    }


    public static void main(String []args){
            ListNode l1 =new ListNode(6);
            ListNode l12 = new ListNode(4);
            ListNode l13 = new ListNode(3);
            l12 = l1.next;
            l13 = l12.next;
            l13.next = null;
            ListNode l2 =new ListNode(7);
            ListNode l22 = new ListNode(0);
            ListNode l23 = new ListNode(8);
            l22 = l2.next;
            l23 = l22.next;
            l23.next = null;

        System.out.println(addTwoNumbers(l1,l2));






    }


}
