class Node{
    Node next;
    int data;
    public Node(int data){
        this.data=data;
        }
        }
public class LinkedListTest {
    Node head;
    public  Node addNode(int data) {
        Node currentNode;
        if (head == null) {
            head = new Node(data);
        }
        currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;

        }
        currentNode.next =new Node(data);
        return head;
    }

    public static void main(String[] args) {
        LinkedListTest link =new LinkedListTest();
        link.addNode(1);
        link.addNode(2);
        link.addNode(3);

        System.out.println(link.head.next.data);
    }
}
