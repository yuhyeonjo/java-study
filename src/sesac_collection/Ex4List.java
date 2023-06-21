package sesac_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex4List {

    public static void main(String[] args) {
        // 데이터 추가 시에는 LinkedList / 데이터 검색 시는 ArrayList가 호율적
        List<String> list = new LinkedList<>();
        for(int i = 0; i < 100000; i++){
            list.add(0, i + "데이터");
        }
        System.out.println("완료");
    }
}
