public class Student extends Person {
    protected String studentId;
    protected String department;
    private static int studentCount = 0;

    public Student() {
        studentCount++;
    }

    public Student(String name, int age, String studentId, String department) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
        studentCount++;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + department);
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
