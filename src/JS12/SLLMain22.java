package JS12;

public class SLLMain22 {
    public static void main(String[] args) {
        SingleLinkedList22 sll = new SingleLinkedList22();
        
        Student22 std1 = new Student22("001", "Student 1", "TI-11", 3.89);
        Student22 std2 = new Student22("002", "Student 2", "TI-11", 3.45);
        Student22 std3 = new Student22("003", "Student 3", "TI-11", 3.20);
        Student22 std4 = new Student22("004", "Student 4", "TI-11", 3.00);
        
        sll.addFirst(std4);
        sll.addLast(std1);
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        
        System.out.println("Initial Linked List:");
        sll.print();
        
        System.out.println("\nExperiment 2 Operations:");
        
        System.out.println("\nData at index 1:");
        Student22 data = sll.getData(1);
        if (data != null) {
            data.print();
        }
        
        int idx = sll.indexOf("Student 1");
        System.out.println("\nStudent 1 is located at index: " + idx);
        
        System.out.println("\nAfter removeFirst():");
        sll.removeFirst();
        sll.print();
        
        System.out.println("\nAfter removeLast():");
        sll.removeLast();
        sll.print();
        
        System.out.println("\nAfter removeAt(0):");
        sll.removeAt(0);
        sll.print();
        
        System.out.println("\nAdding more students for remove demonstration:");
        sll.addFirst(std1);
        sll.addLast(std4);
        sll.print();
        
        System.out.println("\nAfter remove(\"Student 1\"):");
        sll.remove("Student 1");
        sll.print();
        
        System.out.println("\nAfter remove(\"Student 4\"):");
        sll.remove("Student 4");
        sll.print();
    }
}