package sesac_collection;

class Data {
    int m;

    public Data(int m) {
        this.m = m;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Data) return this.m == ((Data)obj).m;
        else return false;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Data data1 = new Data(3);
        Data data2 = new Data(3);
        System.out.println(data1 == data2);
        System.out.println(data1.equals(data2));
        System.out.println(data1.hashCode() == data2.hashCode());
    }
}
