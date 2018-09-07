package backpack;

/**
 * 题目描述：01背包，只有0和1两种状态，要么拿要么不拿
 * 有 n 件物品和一个容量为 m 千克的背包，第i件物品的重量是w[i]，价值是p[i]，求装入物品的最大价值，此时这些物品的重量总和
 * 不能超过背包容量。
 *
 * 思路：
 * w[i]：第i个物体的重量；p[i]：第i个物体的价值；c[i][m]：前i个物体放入容量为m的背包的最大价值；
 * c[i-1][m]：前i-1个物体放入容量为m的背包的最大价值；c[i-1][m-w[i]]：前i-1个物体放入容量为m-w[i]的背包的最大价值
 * 可得：c[i][m]=max{c[i-1][m-w[i]]+pi, c[i-1][m]}
 * https://www.cnblogs.com/lfeng1205/p/5981198.html
 */
public class ZeroOne_BackPack {
    public int backPack(int m, int n, int[] w, int[] p){
        int[][] c = new int[n + 1][m + 1];
        for(int i = 1;i < n + 1;i++){
            for(int j = 1;j < m + 1;j++){
                //如果第i件物品的重量 w[i-1] 小于等于剩余容量 j 时，c[i][j]为下列两种情况之一：
                //1、物品i不放入背包中，所以c[i][j] = c[i-1][j]
                //2、物品i放入背包中，则背包剩余容量能放入w[i-1]，所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
                if(w[i - 1] <= j){
                    if(c[i-1][j] < c[i-1][j-w[i-1]] + p[i-1])
                        c[i][j] = c[i-1][j-w[i-1]] + p[i-1];
                    else
                        c[i][j] = c[i-1][j];
                }else
                    c[i][j] = c[i-1][j];
            }
        }
        return c[n][m];
    }

    public static void main(String[] args) {
        ZeroOne_BackPack backPack = new ZeroOne_BackPack();
        int m = 10;
        int n = 3;
        int[] w = {3, 4, 5};
        int[] p = {4, 5, 6};
        System.out.println(backPack.backPack(m, n, w, p));
    }
}
