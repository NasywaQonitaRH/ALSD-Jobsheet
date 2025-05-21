package P13;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();

        System.out.println("=== Initial List ===");
        dll.print();

        System.out.println("=== Adding Students ===");
        dll.addFirst(new Student("111", "Anton", "TI-1", 3.5));
        dll.addLast(new Student("112", "Budi", "TI-2", 3.7));
        dll.add(1, new Student("113", "Cindy", "TI-3", 3.9));
        dll.print();

        System.out.println("=== Assignment Methods ===");
        System.out.println("First student: ");
        dll.getFirst().print();

        System.out.println("Last student: ");
        dll.getLast().print();

        System.out.println("Student at index 1: ");
        dll.get(1).print();

        System.out.println("Size of list: " + dll.size());
        System.out.println("Index of 112: " + dll.indexOf("112"));

        System.out.println("\n=== Remove After 111 ===");
        dll.removeAfter("111");
        dll.print();

        System.out.println("=== Final Operations ===");
        dll.removeAfter("999"); // Non-existent key
        System.out.println("Size after operations: " + dll.size());
    }
}