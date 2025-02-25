public class StudentMod {
    String studentID;
    String name;
    String className;
    double gpa;

    public StudentMod() {
    }

    public StudentMod(String id, String name, String cls, double gpa) {
        this.studentID = id;
        this.name = name;
        this.className = cls;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Name : " + name);
        System.out.println("Class : " + className);
        System.out.println("GPA : " + gpa);
    }

    public void changeClass(String newClass) {
        this.className = newClass;
    }

    public void updateGPA(double newGPA) {
        this.gpa = newGPA;
    }
}