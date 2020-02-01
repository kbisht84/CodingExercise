package Tree;

public class HouseRobber {
    public int rob(TreeNode root) {
        if(root ==null)
            return 0;
        int [] ret = helper(root);
        return Math.max(ret[0],ret[1]);
    }

    public int[] helper(TreeNode node){
        int [] ret = new int[2];
        if(node == null)
            return ret;
        int[] left = helper(node.left);
        int[] right = helper(node.right);
        ret[0] = node.val + left[1] + right[1];
        ret[1] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        return ret;

    }
}
