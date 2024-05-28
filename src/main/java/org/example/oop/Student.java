public class Student extends Person2{
    private int studentId;

    public Student(String name, int age, int studentId)
    {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public void studentInfo()
    {
        System.out.println();
    }
}
