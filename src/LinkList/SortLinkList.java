package LinkList;

public class SortLinkList {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next != null)
            return head;
        ListNode preSlow = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next !=null){
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preSlow.next = null;
        return mergeTwoList(sortList(head) ,sortList(slow));
    }

    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(l1 !=null && l2 !=null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }
            else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 != null ? l1 : l2;
        return dummy.next;
    }
}
