package P13;

public class DoubleLinkedLists {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }

    // Basic Methods
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Assignment Methods
    public void add(int index, Student data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.data.nim.equals(key)) {
                if (current.next == null) {
                    System.out.println("No node after " + key + " to remove!");
                } else {
                    if (current.next == tail) {
                        removeLast();
                    } else {
                        current.next = current.next.next;
                        current.next.prev = current;
                    }
                    size--;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Key " + key + " not found!");
    }

    private void removeLast() {
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    public Student getFirst() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        }
        return head.data;
    }

    public Student getLast() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        }
        return tail.data;
    }

    public Student get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public int indexOf(String key) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.nim.equals(key)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // Print method
    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            current.data.print();
            current = current.next;
        }
        System.out.println();
    }
}