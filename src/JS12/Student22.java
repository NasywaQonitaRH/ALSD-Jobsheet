package JS12;

public class Student22 {
    String nim, name, className;
    double gpa;

    public Student22() {
    }

    public Student22(String nm, String name, String kls, double ip) {
        nim = nm;
        this.name = name;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}