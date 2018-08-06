package pinduoduo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(str.split("\\s+")[0]);
        int index = Integer.parseInt(str.split("\\s+")[1]);
        String[] nums = new String[num];
        for(int i = 0;i < num;i++)
            nums[i] = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : nums[index].split("\\s+"))
            list.add(Integer.parseInt(s));
        int max = 0;
        int max_index = -1;
        for(int i = 0;i < num;i++){
            if(i == index)
                continue;
            int numIndex = 0;
            for(String s : nums[i].split("\\s+")){
                if(list.contains(Integer.parseInt(s)))
                    numIndex++;
            }
            if(numIndex > max && !list.contains(i)) {
                max = numIndex;
                max_index = i;
            }
        }
        System.out.println(max_index);
    }
}
