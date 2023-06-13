package reference;

public class Student {

    int studentID;
    String studentName;

    /*
    Student클래스에 변수를 만들지 말고 Subject class 생성하기

    int koreaScore;
    int mathScore;

    String koreaName;
    String mathName;
    */

    Subject korea;
    Subject math;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }

    public void setkoreaSubject(int score) {
        korea.score = score;
    }

    public void setMathSubject(int score) {
        math.score = score;
    }

    public void showStudentScore() {
        int total = korea.score + math.score;
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }
}
