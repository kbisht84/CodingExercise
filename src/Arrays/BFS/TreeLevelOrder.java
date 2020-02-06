package Arrays.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class TreeLevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList();
            for(int i=0 ; i< size; i++){
                TreeNode current = queue.remove();
                level.add(current.val);
                if(current.left !=null)
                    queue.add(current.left);
                if(current.right != null)
                    queue.add(current.right);
            }
            result.add(level);
        }

        return result;
    }
}
