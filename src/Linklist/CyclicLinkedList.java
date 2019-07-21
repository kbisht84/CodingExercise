package Linklist;

public class CyclicLinkedList {

    public boolean hasCycle(ListNode head) {
        ListNode slow,fast;
        slow=head;
        fast= slow.next;

        while(slow.next!=null){
            if(slow==fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
          return false;
    }
}
