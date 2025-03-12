package Week5;

import java.util.Scanner;

class Sum {
    double[] profits;

    Sum(int e) {
        profits = new double[e];
    }

    double totalBF() {
        double total = 0;
        for (int i = 0; i < profits.length; i++) {
            total += profits[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r)
            return arr[l];
        int mid = (l + r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum;
    }
}

public class SumMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input element number: ");
        int element = input.nextInt();

        Sum sm = new Sum(element);
        for (int i = 0; i < element; i++) {
            System.out.print("Input profit ke-" + (i + 1) + ": ");
            sm.profits[i] = input.nextDouble();
        }

        System.out.println("Profit total using BF: " + sm.totalBF());
        System.out.println("Profit total using DC: " + sm.totalDC(sm.profits, 0, element - 1));
    }
}