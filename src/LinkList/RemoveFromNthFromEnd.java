package LinkList;
class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }

public class RemoveFromNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slower ,runner;
        slower =head;
        runner =head;
        for(int i=0;i<n;i++){
            runner =runner.next;
        }
        while(runner.next!=null){
            slower=slower.next;
            runner =runner.next;
        }
        slower.next=slower.next.next;
        return head;
    }
}
