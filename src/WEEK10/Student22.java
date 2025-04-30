package WEEK10;

public class Student22 {
    String nim;
    String name;
    String className;
    int grade;
    
    public Student22() {
        this.grade = -1;
    }
    
    public Student22(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }
    
    public void grading(int grade) {
        this.grade = grade;
    }
}