package sesac_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1List {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1); // [1, 2, 3]

        // Arrays.asList() 메서드를 이용해 정적 컬렉션 객체 생성
        List<Integer> list2 = Arrays.asList(1, 2);
        // List<E>는 기본 10만큼 저장 용량을 확보. 저장공간크기를 변경하는 add, remove가 불가능. set은 사용가능
        // list2.add(3);
        // list2.set(1, 3); -> [1, 3]
        System.out.println(list2);
    }

}
