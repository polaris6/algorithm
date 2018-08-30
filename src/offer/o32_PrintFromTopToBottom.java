package offer;

import java.util.ArrayList;

/**
 * 题目描述：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 思路：先进先出，所以引入一个队列。
 */
public class o32_PrintFromTopToBottom {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        int index = 0;
        while(list.size() != index){
            if(list.get(index).left != null)
                list.add(list.get(index).left);
            if(list.get(index).right != null)
                list.add(list.get(index).right);
            index++;
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for(TreeNode tn : list)
            list1.add(tn.val);
        return list1;
    }
}
