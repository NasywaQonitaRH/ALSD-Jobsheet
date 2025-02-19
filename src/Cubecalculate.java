import java.util.Scanner;

public class Cubecalculate {
    public static double volume(double side) {
        return Math.pow(side, 3);
    }

    public static double surfaceArea(double side) {
        return 6 * Math.pow(side, 2);
    }

    public static double perimeter(double side) {
        return 12 * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();

        System.out.println("Choose Calculation Type:");
        System.out.println("1. Volume");
        System.out.println("2. Surface Area");
        System.out.println("3. Perimeter");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Volume: " + volume(side));
                break;
            case 2:
                System.out.println("Surface Area: " + surfaceArea(side));
                break;
            case 3:
                System.out.println("Perimeter: " + perimeter(side));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}