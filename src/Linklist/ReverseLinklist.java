package Linklist;
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL
public class ReverseLinklist {
    public ListNode reverseList(ListNode head) {
            ListNode current,prev,next;
            current = head;
            prev = null;
           while(current!=null){
               next = current.next;
               current.next =prev;
               prev = current;
               current = next;
           }
           head = prev;
           return head;
    }
}
