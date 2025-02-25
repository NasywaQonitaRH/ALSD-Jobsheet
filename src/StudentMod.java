public class StudentMod {
    String studentID;
    String name;
    String className;
    double gpa;

    public StudentMod() { 
    }

    public StudentMod(String id, String name, String cls, double gpa) {
        studentID = id;
        this.name = name;
        className = cls;
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