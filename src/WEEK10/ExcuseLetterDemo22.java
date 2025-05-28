package WEEK10;

import java.util.Scanner; 

public class ExcuseLetterDemo22 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ExcuseLetterStack22 stack = new ExcuseLetterStack22(10);
        Scanner scan = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("5. Exit");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    System.out.print("Type (S for Sick, L for Other): ");
                    char type = scan.nextLine().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    scan.nextLine();
                    
                    ExcuseLetter22 letter = new ExcuseLetter22(id, name, className, type, duration);
                    stack.push(letter);
                    System.out.println("Excuse letter submitted successfully!");
                    break;
                case 2:
                    ExcuseLetter22 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing the following letter:");
                        System.out.println(processed);
                    }
                    break;
                case 3:
                    ExcuseLetter22 latest = stack.peek();
                    if (latest != null) {
                        System.out.println("Latest excuse letter:");
                        System.out.println(latest);
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = scan.nextLine();
                    boolean found = stack.searchByName(searchName);
                    System.out.println(found ? "Letter found for " + searchName : "No letter found for " + searchName);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}