

public class LinkListTest {

    Node head;

    public  Node addNode(int data,Node head){
        Node currentNode;
        if(head==null)
            head =new Node(data);

        currentNode =head;
        while(currentNode.next!=null){
            currentNode= currentNode.next;
        }
        currentNode.next =new Node(data);
        return head;
    }


      public static  void main(String args[]){
        LinkListTest link =new LinkListTest();
        Node node =new Node(1);
        link.addNode(2,node);
        System.out.println(link);

      }

}
