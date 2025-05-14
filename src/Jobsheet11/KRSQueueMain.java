package Jobsheet11;

import java.util.Scanner;

public class KRSQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue queue = new KRSQueue();
        int choice;
        
        do {
            System.out.println("\n=== KRS Approval System ===");
            System.out.println("1. Register Student for KRS");
            System.out.println("2. Process KRS Approval (2 students)");
            System.out.println("3. View Next Student");
            System.out.println("4. View Next Two Students");
            System.out.println("5. View Last Student");
            System.out.println("6. View All Students in Queue");
            System.out.println("7. Clear Queue");
            System.out.println("8. Show Queue Status");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Name : ");
                    String name = sc.nextLine();
                    System.out.print("Study Program : ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class : ");
                    String className = sc.nextLine();
                    Student std = new Student(nim, name, studyProgram, className);
                    queue.enqueue(std);
                    break;
                case 2:
                    queue.dequeueTwo();
                    System.out.println("Total processed today: " + queue.getTotalProcessed());
                    System.out.println("Remaining capacity: " + queue.getRemaining());
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.peekTwo();
                    break;
                case 5:
                    queue.viewRear();
                    break;
                case 6:
                    queue.printAll();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 8:
                    System.out.println("Current queue size: " + queue.getSize());
                    System.out.println("Total processed today: " + queue.getTotalProcessed());
                    System.out.println("Remaining capacity: " + queue.getRemaining());
                    break;
                case 0:
                    System.out.println("Thank you for using KRS Approval System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            
            // Special message for attendance number 22
            if (queue.getSize() == 2 && queue.getTotalProcessed() == 2) {
                System.out.println("\n[Notice for Attendance #22]");
                System.out.println("Two students have been processed and two are waiting!");
            }
        } while (choice != 0);
    }
}