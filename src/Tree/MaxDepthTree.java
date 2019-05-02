package Tree;
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its depth = 3.

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class MaxDepthTree {
    TreeNode root;
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        else
            return Math.max(maxDepth(root.left),maxDepth(root.right)) +1;
    }
}
