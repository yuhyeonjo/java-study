package array2;

import java.util.ArrayList;

public class Student {
    int studentID;
    String StudentName;
    ArrayList<Book> bookList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        StudentName = studentName;
        bookList = new ArrayList<Book>();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void readBook(String title, String author){
        Book book = new Book(title, author);
        book.setTitle(title);
        book.setAuthor(author);
        bookList.add(book);
    }

    public void showStudentInfo() {
        System.out.print(StudentName + " 학생이 읽은 책은 : " );
        for(Book book : bookList) {
            System.out.print(book.getTitle() + " ");
        }
        System.out.println("입니다.");
    }


}
