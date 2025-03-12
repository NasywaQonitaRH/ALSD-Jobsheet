package Week5;

import java.util.Scanner;

public class BruteForceDivideConquer {
    public int factorialBF(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }

    public int factorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialDC(n - 1);
        }
    }
}

class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();
        input.close();

        BruteForceDivideConquer fk = new BruteForceDivideConquer();
        System.out.println("The factorial of " + num + " using BF: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " using DC: " + fk.factorialDC(num));
    }
}
