package sesac_collection;

import java.util.List;
import java.util.Vector;

public class Ex3Vector {
    public static void main(String[] args) {
        List<Boolean> list = new Vector<>();
        list.add(true);
        list.add(false);
        list.add(true);
        Boolean[] bArray = list.toArray(new Boolean[5]);
        System.out.println(bArray);
    }
}
