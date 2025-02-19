public class Function2 {

    public static void main(String[] args) {
        int[][] flowerStock = {
            {10, 6, 2, 5}, // Aglonema
            {5, 11, 10, 7}, // Keladi
            {15, 9, 10, 12}, // Alocasia
            {7, 12, 5, 9} // Mawar
        };

        int[] prices = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar

        calculateIncome(flowerStock, prices);

        int[] deaths = {-1, -2, 0, -5}; // Deaths for Aglonema, Keladi, Alocasia, Mawar
        checkStockAfterDeath(flowerStock, deaths, 3);
    }

    public static void calculateIncome(int[][] stock, int[] prices) {
        for (int i = 0; i < stock[0].length; i++) {
            int income = 0;
            for (int j = 0; j < stock.length; j++) {
                income += stock[j][i] * prices[j];
            }
            System.out.println("Income of RoyalGarden " + (i + 1) + ": " + income);
        }
    }

    public static void checkStockAfterDeath(int[][] stock, int[] deaths, int branchIndex) {
        System.out.println("Stock at RoyalGarden " + (branchIndex + 1) + " after flowers die:");
        for (int i = 0; i < stock.length; i++) {
            int newStock = stock[i][branchIndex] + deaths[i];
            System.out.println(getFlowerName(i) + ": " + newStock);
        }
    }

    public static String getFlowerName(int index) {
        switch (index) {
            case 0: return "Aglonema";
            case 1: return "Keladi";
            case 2: return "Alocasia";
            case 3: return "Mawar";
            default: return "Unknown";
        }
    }
}
