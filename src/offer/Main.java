package offer;

public class Main {
    public int JumpFloorII(int target) {
        int sum = 0;
        if(target == 0 || target == 1)
            sum = 1;
        if(target > 1){
            for(int i = target - 1;i >= 0;i--)
                sum += JumpFloorII(i);
        }
        return sum;
    }
}
