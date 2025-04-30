public class Student22 {
    String studentID;
    String name;
    String className;
    double gpa;

    public Student22(String studentID, String name, String className, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    void print() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Name       : " + name);
        System.out.println("Class      : " + className);
        System.out.println("GPA        : " + gpa);
    }

    void changeClass(String newClass) {
        className = newClass;
    }

    void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    String evaluate() {
        if (gpa >= 3.5) {
            return "Excellent";
        } else if (gpa >= 3.0) {
            return "Good";
        } else if (gpa >= 2.0) {
            return "Fair";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Student22 student1 = new Student22("244107020170", "Nasywa Qonita RH", "TI-1I", 3.56);

        System.out.println("=== Initial Student Information ===");
        student1.print();

        student1.changeClass("TI-1I");
        System.out.println("\nAfter Changing Class:");
        student1.print();

        student1.updateGPA(3.78);
        System.out.println("\nAfter Updating GPA:");
        student1.print();

        System.out.println("\nPerformance Evaluation: " + student1.evaluate());
    }
}