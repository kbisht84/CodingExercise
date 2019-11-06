package Tree;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class NextRightPointers {

    public Node connect(Node root) {
        Node currentNode = root;
        while (currentNode != null && currentNode.left != null) {
            calculateInNextLevel(currentNode);
            currentNode = currentNode.left;
        }
        return root;
    }

    private void calculateInNextLevel(Node startNode) {
        Node iter = startNode;
        while (iter != null) {
            iter.left.next = iter.right;
            if (iter.next != null)
                iter.right.next = iter.next.left;
            iter = iter.next;
        }
    }
}

