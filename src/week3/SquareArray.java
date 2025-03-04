package week3;

import java.util.Scanner;

class Square {
    int side;

    public Square(int s) {
        this.side = s;
    }
}

public class SquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of squares: ");
        int n = scanner.nextInt();

        Square[] squareArray = new Square[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter side for square " + (i + 1) + ": ");
            int side = scanner.nextInt();
            squareArray[i] = new Square(side);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Square " + (i + 1) + " side: " + squareArray[i].side);
        }

        scanner.close();
    }
}