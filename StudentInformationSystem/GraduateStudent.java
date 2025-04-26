public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String studentId, String department, String researchTopic) {
        super(name, age, studentId, department);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}
