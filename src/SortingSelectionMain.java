public class SortingSelectionMain {
    public static void main(String[] args) {
        int[] b = {30, 20, 2, 8, 14};

        SortingSelection sorting2 = new SortingSelection(b);

        System.out.println("Original array:");
        sorting2.print();

        sorting2.selectionSort();

        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();
    }
}