package Student;

public class StudentDemo {
    public static void main(String[] args) {
        TopStudents topStudents = new TopStudents(5);

        // Menambahkan data mahasiswa
        topStudents.add(new Student("2201", "Alice", "A", 3.9));
        topStudents.add(new Student("2202", "Bob", "B", 3.7));
        topStudents.add(new Student("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student("2204", "David", "D", 3.6));
        topStudents.add(new Student("2205", "Eve", "E", 4.0));

        // Menampilkan data sebelum sorting
        System.out.println("Original student list:");
        topStudents.print();

        // Melakukan sorting menggunakan Bubble Sort
        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending):");
        topStudents.print();
    }
}