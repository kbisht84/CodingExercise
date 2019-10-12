package LinkList;

public class IntersectionLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode currentA = headA;
            ListNode currentB = headB;
            int n1=1,n2 =1;
            while(currentA.next !=null) {
                currentA = currentA.next;
                n1++;
            }

            while(currentB.next !=null) {
                currentB = currentB.next;
                n2++;
            }
            if(n2>n1) {
                for(int i=0;i<n2-n1;i++)
                currentB =currentB.next;
            }
            else{
                for(int i=0;i<n1-n2;i++)
                    currentA =currentA.next;
            }
            while(currentA!=currentB) {
                currentA = currentA.next;
                currentB = currentB.next;
            }
                return currentA;
            }
        }

