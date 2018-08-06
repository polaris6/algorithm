package souhu;

import java.util.HashMap;
import java.util.Scanner;

/**
连衣裙 99
衣裙连 10
苹果 80
手机 90
连衣裙
 */

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        String keyString = "";
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.split("\\s").length == 2)
                map.put(str.split("\\s")[0], Integer.parseInt(str.split("\\s")[1]));
            else {
                keyString = str;
                break;
            }
        }
        System.out.println("关键字：" + keyString);
        System.out.println("输出map中的键值对...........");
        for(String key : map.keySet()){
            System.out.println(key + "......" + map.get(key));
        }
    }
}
