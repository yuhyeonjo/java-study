package reference;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Lee");

        s1.setkoreaSubject(100);
        s1.setMathSubject(90);

        s1.showStudentScore();
    }
}
