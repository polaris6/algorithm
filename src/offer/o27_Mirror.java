package offer;

/**
 * 题目描述：二叉树的镜像
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 */
public class o27_Mirror {
    public void mirror(TreeNode root) {
        if(root == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
