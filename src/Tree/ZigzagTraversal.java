package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigzagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if(root == null)
            return list;
        s1.push(root);
        List<Integer> list1 = new ArrayList<>();
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                TreeNode n = s1.pop();
                list1.add(n.val);
                if(n.left !=null)
                    s2.push(n.left);
                if(n.right !=null)
                    s2.push(n.right);
            }
            if(!list1.isEmpty())
                list.add(new ArrayList(list1));
            list1.clear();
            while(!s2.isEmpty()){
                TreeNode n = s2.pop();
                list1.add(n.val);
                if(n.right !=null)
                    s1.push(n.right);
                if(n.left !=null)
                    s1.push(n.left);
            }
            if(!list1.isEmpty())
                list.add(new ArrayList(list1));
            list1.clear();
        }
        return list;
    }
}
