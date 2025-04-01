package Student;

public class SortingInsertion {
    int[] data;
    int size;

    public SortingInsertion(int[] data) {
        this.data = data;
        this.size = data.length;
    }

    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    public void print() {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}