package JS12;

public class StudentQueue22 {
    Node22 front;
    Node22 rear;
    int size;

    public StudentQueue22() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        // Linked list implementation can't be full unless out of memory
        return false;
    }

    public void clear() {
        front = rear = null;
        size = 0;
    }

    public void enqueue(Student22 data) {
        Node22 newNode = new Node22(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public Student22 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        Student22 data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front student:");
            front.data.print();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Rear student:");
            rear.data.print();
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Students in queue:");
            Node22 current = front;
            while (current != null) {
                current.data.print();
                current = current.next;
            }
            System.out.println("Total students: " + size);
        }
    }
}