package JS12;

import java.util.Scanner;

public class QueueMain22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentQueue22 queue = new StudentQueue22();
        
        while (true) {
            System.out.println("\nStudent Service Queue System");
            System.out.println("1. Register new student");
            System.out.println("2. Call next student");
            System.out.println("3. View front student");
            System.out.println("4. View rear student");
            System.out.println("5. View all students in queue");
            System.out.println("6. Clear queue");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Class: ");
                    String className = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();
                    
                    Student22 newStudent = new Student22(nim, name, className, gpa);
                    queue.enqueue(newStudent);
                    System.out.println("Student registered successfully!");
                    break;
                    
                case 2:
                    Student22 calledStudent = queue.dequeue();
                    if (calledStudent != null) {
                        System.out.println("Calling next student:");
                        calledStudent.print();
                    }
                    break;
                    
                case 3:
                    queue.peekFront();
                    break;
                    
                case 4:
                    queue.peekRear();
                    break;
                    
                case 5:
                    queue.displayQueue();
                    break;
                    
                case 6:
                    queue.clear();
                    System.out.println("Queue has been cleared.");
                    break;
                    
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}