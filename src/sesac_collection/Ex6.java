package sesac_collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Data1 {
    int m;

    public Data1(int m) {
        this.m = m;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Data1) return this.m == ((Data1)obj).m;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(m);
    }
}

public class Ex6 {

    public static void main(String[] args) {
        Set<Data1> set = new HashSet<>();
        set.add(new Data1(2));
        set.add(new Data1(2));
        set.add(new Data1(3));
        System.out.println(set.size());
    }

}
