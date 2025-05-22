package JS12;

public class SingleLinkedList22 {
    Node22 head;
    Node22 tail;

    boolean isEmpty() {
        return (head == null);
    }

    void print() {
        if (!isEmpty()) {
            Node22 tmp = head;
            System.out.println("LinkedList Data:");
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList is empty!!");
        }
    }

    void addFirst(Student22 std) {
        Node22 newNode = new Node22(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(Student22 std) {
        Node22 newNode = new Node22(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(Student22 std, String key) {
        Node22 newNode = new Node22(std, null);
        Node22 temp = head;
        do {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Student22 std) {
        if (index < 0) {
            System.out.println("Wrong index!!");
        } else if (index == 0) {
            addFirst(std);
        } else {
            Node22 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node22(std, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    Student22 getData(int idx) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return null;
        }
        Node22 tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
            if (tmp == null) {
                System.out.println("Index out of bounds!");
                return null;
            }
        }
        return tmp.data;
    }

    int indexOf(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return -1;
        }
        Node22 tmp = head;
        int idx = 0;
        while (tmp != null && !tmp.data.name.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return idx;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node22 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    void remove(String key) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
        } else {
            Node22 temp = head;
            Node22 prev = null;
            
            if (temp != null && temp.data.name.equalsIgnoreCase(key)) {
                removeFirst();
                return;
            }
            
            while (temp != null && !temp.data.name.equalsIgnoreCase(key)) {
                prev = temp;
                temp = temp.next;
            }
            
            if (temp == null) {
                System.out.println("Student not found!");
                return;
            }
            
            prev.next = temp.next;
            
            if (temp == tail) {
                tail = prev;
            }
        }
    }

    void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty!!");
            return;
        }
        
        if (index == 0) {
            removeFirst();
            return;
        }
        
        Node22 temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        
        if (temp == null || temp.next == null) {
            System.out.println("Index out of bounds!");
            return;
        }
        
        Node22 next = temp.next.next;
        temp.next = next;
        
        if (next == null) {
            tail = temp;
        }
    }
}