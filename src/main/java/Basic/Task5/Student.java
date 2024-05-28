package Basic.Task5;

public class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId > 0) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "studentId=" + studentId +
                '}';
    }
}
