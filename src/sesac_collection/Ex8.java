package sesac_collection;

import java.util.HashMap;
import java.util.Map;

public class Ex8 {
    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<>();
        map.put("사운드", true);
        map.put("그래픽", false);
        map.put("배경음", true);
        map.put("그래픽", true);

        System.out.println(map);
    }

}
