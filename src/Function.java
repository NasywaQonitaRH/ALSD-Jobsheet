import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Flower names
        String[] flowerNames = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        // Prices of flowers
        int[] prices = {75000, 50000, 60000, 10000};

        // Flower stock
        int[][] flowerStock = new int[4][4]; // 4 branches, 4 flower types

        System.out.println("Enter the stock of flowers for each branch:");
        for (int branch = 0; branch < 4; branch++) {
            System.out.println("RoyalGarden " + (branch + 1) + ":");
            for (int flower = 0; flower < 4; flower++) {
                System.out.print(flowerNames[flower] + ": ");
                flowerStock[branch][flower] = scanner.nextInt();
            }
            System.out.println();
        }

        displayIncome(flowerStock, prices);

        int[] stockReduction = {-1, -2, 0, -5};

        // Display updated stock for RoyalGarden 4
        displayStockAfterDeath(flowerStock, stockReduction, 3); // Branch 4 (index 3)

        scanner.close();
    }

    public static void displayIncome(int[][] stock, int[] prices) {
        for (int branch = 0; branch < stock.length; branch++) {
            int income = 0;
            for (int flower = 0; flower < stock[branch].length; flower++) {
                income += stock[branch][flower] * prices[flower];
            }
            System.out.println("Income of RoyalGarden " + (branch + 1) + ": Rp " + income);
        }
    }

    public static void displayStockAfterDeath(int[][] stock, int[] reduction, int branchIndex) {
        System.out.println("\nUpdated Stock at RoyalGarden " + (branchIndex + 1) + " after flower deaths:");
        String[] flowerNames = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        for (int flower = 0; flower < stock[branchIndex].length; flower++) {
            int updatedStock = stock[branchIndex][flower] + reduction[flower];
            System.out.println(flowerNames[flower] + ": " + updatedStock);
        }
    }
}