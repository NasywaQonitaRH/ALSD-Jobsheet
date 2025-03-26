package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LecturerData data = new LecturerData();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Bubble Sort)");
            System.out.println("4. Sort DSC (Selection Sort)");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("ID: ");
                String id = scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Gender (true = Male, false = Female): ");
                boolean gender = scanner.nextBoolean();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                data.add(new Lecturer(id, name, gender, age));
            } else if (choice == 2) {
                data.print();
            } else if (choice == 3) {
                data.sortingASC();
                System.out.println("Sorted in Ascending Order!");
            } else if (choice == 4) {
                data.sortingDSC();
                System.out.println("Sorted in Descending Order!");
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}