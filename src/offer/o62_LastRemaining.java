package offer;

import java.util.LinkedList;

/**
 * 题目描述：圆圈中最后剩下的数字
 * 0—n-1这n个数字围成一圈，从0开始，每次剔除第m个数字，求剩下的最后一个数字
 */
public class o62_LastRemaining {
    public int lastRemaining(int n, int m) {
        if(n == 0 || m == 0)
            return -1;
        LinkedList<Integer> list = new LinkedList<>();
        int index = 0;
        for(int i = 0;i < n;i++)
            list.add(i);
        while(list.size() > 1){
            index += m - 1;
            if(index < list.size())
                list.remove(index);
            else{
                while(index >= list.size())
                    index -= list.size();
                list.remove(index);
            }
        }
        return list.get(0);
    }
}
