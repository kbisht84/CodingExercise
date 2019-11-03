package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
Inorder traversal with iteration using stacks
 */

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return list;
        while (true) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) break;
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}



