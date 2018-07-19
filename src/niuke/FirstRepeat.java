package niuke;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeat {
    public char findFirstRepeat(String A, int n) {
        Map<Character,Integer> map = new HashMap<>();
        char output = A.charAt(0);
        for(Character c : A.toCharArray()) {
            if(map.get(c) != null) {
                output = c;
                break;
            }
            map.put(c,1);
        }
        return output;
    }
}
