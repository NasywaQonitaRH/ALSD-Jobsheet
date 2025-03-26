package Student;

public class StudentDemoSorting {
    public static void main(String[] args) {
        TopStudentsSorting topStudents = new TopStudentsSorting(5);

        topStudents.add(new StudentSorting("2201", "Alice", "A", 3.9));
        topStudents.add(new StudentSorting("2202", "Bob", "B", 3.7));
        topStudents.add(new StudentSorting("2203", "Charlie", "C", 3.8));
        topStudents.add(new StudentSorting("2204", "David", "D", 3.6));
        topStudents.add(new StudentSorting("2205", "Eve", "E", 4.0));

        System.out.println("Original student list:");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending) using Bubble Sort:");
        topStudents.print();

        topStudents.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection Sort:");
        topStudents.print();
    }
}