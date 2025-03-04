package week3;

import java.util.Scanner;

public class ArrayOfObjectsUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rectangles: ");
        int size = sc.nextInt();

        Rectangle2[] rectangleArray = new Rectangle2[size];

        for (int i = 0; i < size; i++) {
            rectangleArray[i] = new Rectangle2();
            System.out.println("Rectangle " + i);

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("Width: " + rectangleArray[i].width + ", Length: " + rectangleArray[i].length);
        }

        sc.close();
    }
}