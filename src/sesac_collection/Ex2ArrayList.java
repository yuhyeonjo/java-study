package sesac_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex2ArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list); // [2, 3, 4]
        list.remove(2);
        System.out.println(list); // [2, 3]
    }
}
