package Tree;

public class ValidBST {

    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        if(root!=null&&root.left==null&&root.right==null)
            return true;
        if(root.left!=null&&root.val>root.left.val)
            return isValidBST(root.left) && isValidBST(root.right);
        if(root.right!=null&&root.val<root.right.val)
            return isValidBST(root.right) && isValidBST(root.left);
        return false;
    }
}
