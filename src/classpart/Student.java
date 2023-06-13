package classpart;

public class Student {

    int studentID;
    String studentName;
    String address;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소없음";

    }

    public void showStudentInfo() {
        System.out.println( studentID + ", " + studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }
}
