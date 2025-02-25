public class StudentMod {
    String studentID;
    String name;
    String className;
    double gpa;

    public StudentMod() { 
        // Initialize with default values
        this.studentID = "Unknown";
        this.name = "Unknown";
        this.className = "Unknown";
        this.gpa = 0.0;
    }

    public StudentMod(String id, String name, String cls, double gpa) {
        this.studentID = id;
        this.name = name;
        this.className = cls;
        this.gpa = gpa;
    }

    public void updateGPA(double newGPA) {
        this.gpa = newGPA;
    }

    public void changeClass(String newClass) {
        this.className = newClass;
    }

    public void print() {
        System.out.println("Student ID  : " + studentID);
        System.out.println("Name        : " + name);
        System.out.println("Class       : " + className);
        System.out.println("GPA         : " + gpa);
        System.out.println();
    }
}