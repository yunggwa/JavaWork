package Day08;

class Student{
    int studentId;
    String studentName;
    int grade;
    String address;

    void showStudentInfo(){
        System.out.println(studentName + ", " + address);
    }
}

public class ClassTest2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "권윤경";
        student1.address = "부평구";
        student1.showStudentInfo();

        Student student2 = new Student();
        student2.studentName = "김덕배";
        student2.address = "미추홀구";
        student2.showStudentInfo();
    }
}
