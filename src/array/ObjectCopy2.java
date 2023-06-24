package array;

public class ObjectCopy2 {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("책1", "저자1");
        library[1] = new Book("책2", "저자2");
        library[2] = new Book("책3", "저자3");
        library[3] = new Book("책4", "저자4");
        library[4] = new Book("책5", "저자5");

        // 객체 배열 깊은 복사 : 복사된 배열이나 원본배열이 변경될 때 서로 간의 값은 바뀌지 않음
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0; i < library.length; i++){
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        library[0].setTitle("일의 기쁨과 슬픔");
        library[0].setAuthor("장류진");

        for(Book book : copyLibrary){
            book.showBookInfo();
        }

        System.out.println("=============================");

        for(Book book : library){
            book.showBookInfo();
        }
   }



}
