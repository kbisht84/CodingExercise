package LinkList;

public class OddEvenSeparation {
    ListNode currentNode ,currentNode1,head1;
    public ListNode oddEvenList(ListNode head) {
            if(head ==null) return null;
            currentNode = head;
            head1 = head.next;
            currentNode1 = head1;

            while (currentNode1 != null && currentNode1.next != null) {
                currentNode.next = currentNode1.next;
                currentNode = currentNode.next;
                currentNode1.next = currentNode.next;
                currentNode1 = currentNode1.next;
            }
            currentNode.next = head1;
         return head;


    }
}
