package staticex;

public class Student {

    private static int serialNum = 1000;
    private int studentID;
    public String studentName;
    public String address;

    public Student(String name) {
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소없음";
        serialNum++;
        studentID = serialNum;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
