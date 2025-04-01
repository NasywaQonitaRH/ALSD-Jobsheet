package Student;

public class SortingInsertionMain {
    public static void main(String[] args) {
        int[] c = {40, 10, 4, 9, 3};

        SortingInsertion sorting3 = new SortingInsertion(c);

        System.out.println("Original array:");
        sorting3.print();

        sorting3.insertionSort();

        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();
    }
}