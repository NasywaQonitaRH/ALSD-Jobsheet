public class SortingSelection {
    int[] data;
    int size;

    public SortingSelection(int[] data) {
        this.data = data;
        this.size = data.length;
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public void print() {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}