public class Main {
    public static void main(String[] args) {
        // Creating Student
        Student s1 = new Student("Shubham", 20, "S001", "Computer Science");

        // Creating Graduate Student
        GraduateStudent gs1 = new GraduateStudent("Shivani", 24, "S002", "Cybersecurity", "AI in Forensics");

        // Display Info
        System.out.println("=== Student ===");
        s1.displayInfo();

        System.out.println("\n=== Graduate Student ===");
        gs1.displayInfo();

        // Total Student Count
        System.out.println("\nTotal Students: " + Student.getStudentCount());

        // Course Info
        Course c1 = new Course("CS101", "Data Structures", 4);
        System.out.println("\n=== Course Details ===");
        c1.displayCourse();

        // Grade Calculation
        GradeSystem grader = new GradeSystem();
        int marks = 87;
        System.out.println("\nGrade for " + marks + " marks: " + grader.calculateGrade(marks));
    }
}