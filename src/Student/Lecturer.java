package Student;

import java.util.Scanner;

class Lecturer {
    String id;
    String name;
    boolean gender;
    int age;

    Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void print() {
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + (gender ? "Male" : "Female") + ", Age: " + age);
    }
}