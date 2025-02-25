public class Student {
    String studentID;
    String name;
    String className;
    double gpa;

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