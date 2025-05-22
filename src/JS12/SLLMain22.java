package JS12;

import java.util.Scanner;

public class SLLMain22 {
    public static void main(String[] args) {
        SingleLinkedList22 sll = new SingleLinkedList22();
        
        sll.print();
        
        Student22 std1 = new Student22("001", "Student 1", "TI-11", 3.89);
        Student22 std2 = new Student22("002", "Student 2", "TI-11", 3.45);
        Student22 std3 = new Student22("003", "Student 3", "TI-11", 3.20);
        Student22 std4 = new Student22("004", "Student 4", "TI-11", 3.00);
        
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();
        
        System.out.println("Data at index 1 is:");
        Student22 data = sll.getData(1);
        data.print();
        
        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdd new student via keyboard input:");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Class: ");
        String className = scanner.nextLine();
        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();
        
        Student22 newStd = new Student22(nim, name, className, gpa);
        sll.addLast(newStd);
        System.out.println("After adding new student:");
        sll.print();
    }
}