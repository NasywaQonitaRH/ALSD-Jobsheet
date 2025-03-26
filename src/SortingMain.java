public class SortingMain {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};

        Sorting sorting = new Sorting(a);

        System.out.println("Original array:");
        sorting.print();

        sorting.bubbleSort();

        System.out.println("Sorted array (Bubble Sort):");
        sorting.print();
    }
}