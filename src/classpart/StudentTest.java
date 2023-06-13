package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Lee");

        // s1.studentName = "Lee";
        // s1.studentID = 1;
        s1.address = "서울";

        s1.showStudentInfo();

        Student s2 = new Student(2, "Kim");

        // s2.studentID = 2;
        // s2.studentName = "Kim";
        s2.address = "대전";

        s2.showStudentInfo();
    }
}
